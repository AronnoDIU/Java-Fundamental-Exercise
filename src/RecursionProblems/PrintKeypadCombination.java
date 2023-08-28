package RecursionProblems;

// Print Keypad Combination

/*                          for "23"==>
    0   =>  .                               --------2---------                          3
    1   =>  abc                           /         |          \                    /   |  \
    2   =>  def                          /          |           \                  g    h   i
    3   =>  ghi                        d            e             f                  \  |  /
    4   =>  jkl                     /  |  \      /  |  \       /  |  \                  |
    5   =>  mno                   dg  dh  di    eg  eh  ei   fg  fh  fi   <------------------
    6   =>  pqrs
    7   =>  tu
    8   =>  vwx
    9   =>  yz


* */
public class PrintKeypadCombination {
    public static String[]
            keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void
    printCombination(String string, int index, String combination) {

        if (index == string.length()) {
            System.out.println(combination);
            return;
        }

        char currentCharacter = string.charAt(index);
        String mapping = keypad[currentCharacter - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printCombination(string, index + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String string = "23";
        printCombination(string, 0, "");
    }
}

/*
Expected Output::

dg
dh
di
eg
eh
ei
fg
fh
fi

* */