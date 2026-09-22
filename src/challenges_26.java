class challenges_26 {
        public static void main(String[] args) {
            int[] numss = arrayUtility.inputArray();
            long sum = sum(numss);
            int average = average(numss);
            System.out.println("The sum of integers is: "+ sum);
            System.out.println("THe average of array elements is: "+average);

        }

        public static long sum(int[] numarray) {
            int sum = 0;
            int i=0;
            while(i<numarray.length){
                sum += numarray[i];
                i++;
            }return sum;

        }

        public static int average(int[] numArray){
            long sum = sum(numArray);
            return (int)(sum/numArray.length);
        }
    }

