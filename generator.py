#!/usr/bin/python

import random

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
			print '-',
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
	n = random.randrange(10 ** 3)
	while n > 0 :
		random.seed()
		mode = random.randint(0, 1)
		generate(mode, 4)
		n -= 1
		print