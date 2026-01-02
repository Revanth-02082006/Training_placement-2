def product_digits(num):
    if num == 0: return 1
    return (num%10) * product_digits(num//10)

print(product_digits(234))
