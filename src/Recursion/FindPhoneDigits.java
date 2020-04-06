package Recursion;

class PhoneDigit
{
    static void possibleWords(int a[], int N)
    {


        findPossibleWordsList(a,"",0);


    }

    public static void main(String []args){
        possibleWords(new int[]{6, 4, 5, 5},4);
    }

    public static void findPossibleWordsList(int[] arr, String curr, int n){
        if(n == arr.length){
            System.out.print(curr + " ");
        }
        else{
            switch(arr[n]){
                case 2:
                    findPossibleWordsList(arr,curr.concat("a"),n+1);
                    findPossibleWordsList(arr,curr.concat("b"),n+1);
                    findPossibleWordsList(arr,curr.concat("c"),n+1);
                    break;
                case 3:
                    findPossibleWordsList(arr,curr.concat("d"),n+1);
                    findPossibleWordsList(arr,curr.concat("e"),n+1);
                    findPossibleWordsList(arr,curr.concat("f"),n+1);
                    break;
                case 4:
                    findPossibleWordsList(arr,curr.concat("g"),n+1);
                    findPossibleWordsList(arr,curr.concat("h"),n+1);
                    findPossibleWordsList(arr,curr.concat("i"),n+1);
                    break;
                case 5:
                    findPossibleWordsList(arr,curr.concat("j"),n+1);
                    findPossibleWordsList(arr,curr.concat("k"),n+1);
                    findPossibleWordsList(arr,curr.concat("l"),n+1);
                    break;
                case 6:
                    findPossibleWordsList(arr,curr.concat("m"),n+1);
                    findPossibleWordsList(arr,curr.concat("n"),n+1);
                    findPossibleWordsList(arr,curr.concat("o"),n+1);
                    break;
                case 7:
                    findPossibleWordsList(arr,curr.concat("p"),n+1);
                    findPossibleWordsList(arr,curr.concat("q"),n+1);
                    findPossibleWordsList(arr,curr.concat("r"),n+1);
                    findPossibleWordsList(arr,curr.concat("s"),n+1);
                    break;
                case 8:
                    findPossibleWordsList(arr,curr.concat("t"),n+1);
                    findPossibleWordsList(arr,curr.concat("u"),n+1);
                    findPossibleWordsList(arr,curr.concat("v"),n+1);
                    break;
                case 9:
                    findPossibleWordsList(arr,curr.concat("w"),n+1);
                    findPossibleWordsList(arr,curr.concat("x"),n+1);
                    findPossibleWordsList(arr,curr.concat("y"),n+1);
                    findPossibleWordsList(arr,curr.concat("z"),n+1);
                    break;

            }

        }


    }


}
