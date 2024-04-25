def letters():
    alphabet_set = set()
    for i in range(97, 123):
        #print(chr(i))
        alphabet_set.add(chr(i))
    #print(alphabet_set)
    return alphabet_set

def make_letter_frequency(filename):
    letter_set = letters()
    letter_dictionary = {char: 0 for char in letter_set}

    with open(filename) as file:
        for line in file:
            line = line.lower()
            for char in line:
                if char in letter_set:
                    letter_dictionary[char] += 1
    return letter_dictionary

def print_letter_frequency(dictionary):
    for key, value in dictionary.items():
        print(key + " : " + str(value))

def main():
    #print(letters())
    dictionary = make_letter_frequency("data/alice.txt")
    #print(dictionary)
    print("data/alice.txt")
    print_letter_frequency(dictionary)

    dictionary = make_letter_frequency("data/rit_mission.txt")
    #print(dictionary)
    print("\n" + "data/rit_mission.txt")
    print_letter_frequency(dictionary)

if __name__ == "__main__":
    main()