public class Cipher {
    private int Key;
    private String inputText;
    private String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String lowercase = "abcdefghijklmnopqrstuvwxyz";
    private String special = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
    private String numbers = "0123456789";
    private String output = "";

    public int getKey() {
        return this.Key;
    }
    public String getInputText() {
        return this.inputText;
    }

    public String encrypt(String Statement, int Key) {
        this.inputText = Statement.toUpperCase();
        this.Key = Key;
        if (Key > 26) {
            Key = Key % 26;
        } else {
            Key = (Key % 26) + 26;
        }
        for (int i = 0; i < Statement.length(); i++) {
            char charAt = Statement.charAt(i);
            if (Character.isLetter(charAt)) {
                if (Character.isLowerCase(charAt)) {
                    char keyAndcharAt = (char) (charAt + Key);
                    if (keyAndcharAt > 'z') {
                        output = output + (char) (charAt - (26 - Key));
                    } else {
                        output = output + keyAndcharAt;
                    }


                } else if (Character.isUpperCase(charAt)) {
                    char keyAndcharAt = (char) (charAt + Key);
                    if (keyAndcharAt > 'Z') {
                        output = output + (char) (charAt - (26 - Key));
                    } else {
                        output = output + keyAndcharAt;
                    }
                } else {
                    output = output + charAt;
                }
            }
        }
        return output;
    }

    public String decrypt(String input, int Key) {

        if(Key>26){
            Key=Key%26;
        }else{
            Key = (Key%26)+26;
        }
        for(int i=0;i<input.length();i++) {
            char newCharacter = input.charAt(i);
            if (Character.isLetter(newCharacter)) {
                if (Character.isLowerCase(newCharacter)) {
                    char minKey = (char) (newCharacter - Key);
                    if (minKey < 'a') {
                        output = output + (char) (newCharacter + (26 - Key));
                    } else {
                        output = output + minKey;
                    }
                } else if(Character.isUpperCase(newCharacter)) {
                    char maxKey = (char) (newCharacter + Key);
                    if (maxKey < 'A'){
                        output = output + (char) (newCharacter + (26 - Key));
                    } else {
                        output = output + maxKey;
                    }
                }
                else{
                    output = output + newCharacter;
                }
            }

        }

        return output;
    }
}
