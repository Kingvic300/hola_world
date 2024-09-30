reverse = 0
add = 0
number = input("Enter number ")
#if number > 0 and number < 1000:
while number!= 0:
	reverse = (reverse * 10) + (number % 10)
	number = number // 10
	add = number+reverse
print(add)
#else:
#	print("error")
