#!/usr/bin/python

if __name__ == '__main__':
	try:
		while True :
			L = raw_input()
			print eval(L)
	except EOFError, e:
		pass