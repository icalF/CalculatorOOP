#!/usr/bin/python

import random
import sys

arith = ['+', '-', '/', '*', '//', '%']
logic = ['or', 'and', '^']
compare = ['>', '>=', '==', '<', '<=', '<>']

def generate(mode, depth):
	random.seed()
	operation = random.randint(0, 2)
	print '(',

	if (operation == 0) or (depth == 0) :		# literal
		if mode == 0 :	# logic
			random.seed()
			print random.choice([True, False]),
		else :				# arith
			random.seed()
			print random.randint(-29999, 29999),
	elif operation == 1 :					# unary operation
		if mode == 0 :
			print 'not',
		else :
			sys.stdout.write('-')
		generate(mode, depth - 1)
	else :							# binary operation
		if mode == 1 :
			generate(1, depth - 1)
			random.seed()
			print random.choice(arith),
			generate(1, depth - 1)
		else :
			random.seed()
			opt = random.randint(0, 1)
			if opt == 0 :		# comparator
				generate(0, depth - 1)
				random.seed()
				print random.choice(logic),
				generate(0, depth - 1)
			else :
				generate(1, depth - 1)
				random.seed()
				print random.choice(compare),
				generate(1, depth - 1)

	print ')',



if __name__ == '__main__':
	random.seed()
	n = 1000
	while n > 500 :
		generate(1, 4)
		n -= 1
		print
	while n > 0 :
		generate(0, 4)
		n -= 1
		print