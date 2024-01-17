# direct initialization in all format
v = 15  # dec
v = 0b1111  # bin
v = 0xf  # hex
v = 0o17  # oct

# input in all format
# bin - 2, oct - 8, hex - 16, dec - 10
v = int(input("Enter binary number : "), 2)

# output in all format
print(hex(v))  # bin(), oct(), hex(), simple "print(v)" for dec
