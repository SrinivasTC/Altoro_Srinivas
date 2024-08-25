def main():
    # nitin  # nitin
    str_ = "nitin"  # palindrome string
    # length of str_ == 5
    # index of n = 4

    # str_ = string value of madam

    rev = ""  # empty string to store reversed string

    for i in range(len(str_) - 1, -1, -1):


        #


        # 5-1=4; 4>=0; 4-1=3
        # 3-1=2; 2>=0; 2-1=1
        # 1-1=0; 0>=0; 0-1=-1
        rev += str_[i]
        print(rev)

        # madam

    if str_ == rev:
        print(rev)
    else:
        print(rev + " it is not a palindrome string ")


if __name__ == "__main__":
    main()
