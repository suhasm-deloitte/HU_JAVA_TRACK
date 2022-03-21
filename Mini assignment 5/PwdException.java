class passwordException  extends Exception {

        int passwordviolated = 0;

        public passwordException(int conditionViolated)
        {
                super("Invalid Password: ");
                passwordviolated = conditionViolated;
        }

        public String printMessage()
        {

                switch (passwordviolated) {


                        case 1:
                                return ("Password length should be"
                                        + " between 5 to 10 characters");

                        case 2:
                                return ("Password should contain"
                                        + " at least one digit(0-9)");


                        case 3:
                                return ("Password should contain at "
                                        + "least one special character");


                        case 4:
                                return ("Password should contain at"
                                        + " least one uppercase letter(A-Z)");


                        case 5:
                                return ("Password should contain at"
                                        + " least one lowercase letter(a-z)");
                }

                return ("");
        }
}
class PasswordValidator {


        public static void isValid(String password)
                throws passwordException
        {


                if (!((password.length() >= 5)
                        && (password.length() <= 10))) {
                        throw new passwordException(1);
                }


                if (true) {
                        int count = 0;
                        for (int i = 0; i <= 9; i++) {
                                String str1 = Integer.toString(i);
                                if (password.contains(str1)) {
                                        count = 1;
                                }
                        }
                        if (count == 0) {
                                throw new passwordException(2);
                        }
                }

                if (!(password.contains("@") || password.contains("#")
                        || password.contains("!") || password.contains("~")
                        || password.contains("$") || password.contains("%")
                        || password.contains("^") || password.contains("&")
                        || password.contains("*") || password.contains("(")
                        || password.contains(")") || password.contains("-")
                        || password.contains("+") || password.contains("/")
                        || password.contains(":") || password.contains(".")
                        || password.contains(", ") || password.contains("<")
                        || password.contains(">") || password.contains("?")
                        || password.contains("|"))) {
                        throw new passwordException(3);
                }

                if (true) {
                        int count = 0;
                        for (int i = 65; i <= 90; i++) {
                                char c = (char)i;
                                String str1 = Character.toString(c);
                                if (password.contains(str1)) {
                                        count = 1;
                                }
                        }
                        if (count == 0) {
                                throw new passwordException(4);
                        }
                }

                if (true) {
                        int count = 0;
                        for (int i = 90; i <= 122; i++) {
                                char c = (char)i;
                                String str1 = Character.toString(c);
                                if (password.contains(str1)) {
                                        count = 1;
                                }
                        }
                        if (count == 0) {
                                throw new passwordException(5);
                        }
                }

        }
        public static void main(String[] args)
        {
                String password1 = "suhas";
                try {
                        isValid(password1);
                        System.out.println(password1 + " is Valid Password");
                }
                catch (passwordException e) {
                        System.out.println(password1);
                        System.out.print(e.getMessage());
                        System.out.println(e.printMessage());
                }

                String password2 = "Suhas1@";
                try {
                        isValid(password2);
                        System.out.println(password2+ " is Valid Password");
                }
                catch (passwordException e) {
                        System.out.print(e.getMessage());
                        System.out.println(e.printMessage());
                }
        }

}