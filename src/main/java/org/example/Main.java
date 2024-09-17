package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
     //console-1
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
     //console-2
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
     //console-3
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));

    }
     //Soru-1: isPalindrome
    public static boolean isPalindrome (int number){
        int originalNum=number;
        System.out.println(number);
        int reversedNumber=0;
        while(number !=0){
            int modNum = number %10;
            reversedNumber = reversedNumber * 10 + modNum;
            number/=10;
        }
        return reversedNumber == originalNum;
    }
     //parametre olarak alınan sayının mod 10'unu alıyorum
     //sayıyı 10'a bölerek son basamağı olmadan döngüye devam ediyorum
     //reversed number güncellenerek sayının tersten yazılışını dönüyor
     //parametre olarak alınan değerle karşılaştırıyorum.


    //Soru-2: isPerfectNumber
    public static boolean isPerfectNumber(int number){
        if(number<0){
            return false;
        }
        int toplam=0;
        for(int i=1; i<=number/2 ; i++ ){
           if( number%i == 0){
               toplam += i;
           }
        }return number == toplam ;
    }//parametre 0'dan küçükse false döndürüyorum.
    //sayının yarısından sonrasını tam bölünmeyeceği için almıyorum. index-->number/2
    //döngüyle parametreyi index numaralarına bölerek kalanların 0'a eşit olup olmadığını kontrol ediyorum.
    //0'a eşitse bölenleri topluyorum.
    //toplam ve parametre aynı ise true dönüyorum.


    //Soru-3: numberToWords
    public static String numberToWords(int number){
        if(number<0) return "Invalid Value";
        char[] numberChars = String.valueOf(number).toCharArray();
        String numberString="";
        for(char numberChar: numberChars){
            switch (numberChar){
                case '0':
                    numberString += "Zero ";
                    break;
                case '1':
                    numberString += "One ";
                    break;
                case '2':
                    numberString += "Two ";
                    break;
                case '3':
                    numberString += "Three ";
                    break;
                case '4':
                    numberString += "Four ";
                    break;
                case '5':
                    numberString += "Five ";
                    break;
                case '6':
                    numberString += "Six ";
                    break;
                case '7':
                    numberString += "Seven ";
                    break;
                case '8':
                    numberString += "Eight ";
                    break;
                case '9':
                    numberString += "Nine ";
                    break;
            }
        }
        return numberString.trim();
    }//***!! char tek tırnakla yazılır !!***
    //parametreyi char arrayine çeviriyorum ['3','7','9']
    //forEach döngüsüyle her karaktere bakıyorum
    //switch-case (if else kullanmıyorum çünkü koşul çok var)
    //koşulu sağlayan stringleri topluyorum
    //sonda ve başta boşluk olmaması için trim methodu kullanıyorum.
}
