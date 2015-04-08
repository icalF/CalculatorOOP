#!/usr/bin/python

if __name__ == '__main__':
	try:
		while True :
			L = raw_input().split()
			Bener = {
				'True' : 'true',
				'False' : 'false',
				'%' : 'mod',
				'//' : 'div',
				'^' : 'xor',
				'==' : '='
			}
			for s in L :
				if s in Bener :
					print Bener[s],
				else:
					print s,
			print
	except EOFError, e:
		pass