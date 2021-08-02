# -Caesar-Cipher

* This program was created using Java .
#### Author
* Ken Kibet

### Description
* This program uses a command line interface to encrypt or decrypt words using an appropriate key which is a number.
* The action of a Caesar cipher is to replace each plaintext letter with a different one a fixed number of places down the alphabet

## Prerequisites & setup
#### Prerequisites
* Git.
* Java
* Intellij
* Gradle

#### Set up
* clone the repo into your computer by running `git clone https://github.com/kenkibet/-Caesar-Cipher` on your terminal.
* run the command `gradle build`
* navigate into the build\classes/java/main/ directory created using the command `cd build\classes/java/main/`.
* run the command `java Main`.

* Or open in intellij and click run


|example|input| output
|----|----|------
|encrypt => word: 'ken', key: 1|String=>word, Integer=>key|String:'lfo'
|decrypt => word: 'lfo', key: 1|String=>word, Integer=>key|String:'ken'
|encrypt => word: 'kibet', key: 2|String=>word, Integer=>key|String:'mkdgv'
|decrypt => word: 'mkdgv', key: 2|String=>word, Integer=>key|String:'kibet'

### How to use
* Enter the word you would like to encrypt.
* Type number '1' to encrypt.
* Enter a number to use as the key for the encryption.
* Type number '2' to decrypt.
* Type the word to be decrypted.
* Enter the number to be used as the key for decryption.
* To exit type number '3'.

#### Known Bugs
* In case of of any bugs found please contact using the information below.

#### Contact Information
* email - kenkibet@gmail.com

## Copyright and license.
* (c) 2021 Ken Kibet Moringa School.
* MIT License.
