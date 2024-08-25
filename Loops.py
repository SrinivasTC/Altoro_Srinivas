str = "RRRrrr"
# to give count for the characters

for i in range(len(str)):

    #AAABBccffsfscccDDDdd
    #AAABBccffsfscccDDDdd
    count = 0  # Initialize count for the current character


    # Check if the character has already been counted
    #
    is_already_counted = False  #  A
    for k in range(i):
        # AAABBccffsfscccDDDdd

        if str[i] == str[k]:
            #A==A
            is_already_counted = True
            break
  # AB
    # If the character has been counted, skip to the next character
    if is_already_counted:
        continue
        # ABcfsDd -
        #
        #
        #
        # -- WE GET ONLY REPATED CHARACTERS
    # Count occurrences of the current character
    for j in range(len(str)):
        # #AAABBccffsfscccDDDdd

        if str[i] == str[j]:
        #AAABBccffsfscccDDDdd= = # #AAABBccffsfscccDDDdd

            count += 1

    # Print the character and its count
    print(str[i], count)

