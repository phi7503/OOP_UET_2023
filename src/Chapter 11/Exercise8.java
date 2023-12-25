package exercise;

class ExceptionA(Exception):
    def __str__(self):
        return "Đây là ExceptionA"

class ExceptionB(ExceptionA):
    def __str__(self):
        return "Đây là ExceptionB"

class ExceptionC(ExceptionB):
    def __str__(self):
        return "Đây là ExceptionC"

# Chương trình minh họa
try:
    # Gọi một hàm hoặc thực hiện một công việc có thể ném ngoại lệ
    raise ExceptionC()

except ExceptionA as ex_a:
    print(f"Bắt ngoại lệ thuộc loại ExceptionA: {ex_a}")

except ExceptionB as ex_b:
    print(f"Bắt ngoại lệ thuộc loại ExceptionB: {ex_b}")

except ExceptionC as ex_c:
    print(f"Bắt ngoại lệ thuộc loại ExceptionC: {ex_c}")
