public class LogicsAndNumbersStuff {

        public static int diffMultipliedByC(int a, int b, int c)
        {
            return (a-b) * c;
        }

        public static boolean canYouStayInBed(boolean weekday, boolean vacation)
        {
            if ((weekday && vacation) == true){
                return false;
            } else if (weekday == true) {
                return false;
            } else if (vacation == true){
                return false;
            } else {
                return true;
            }
        }

        public static int sumOfNumbers(int[] numbers)
        {
            int sum = 0;
            for (int i = 0; i < numbers.length ; i++) {

                sum += numbers[i];
            }
            return sum;
        }

        public static double averageOfNumber(int[] numbers) {
            int sum = 0;
            int i;
            for (i = 0; i < numbers.length; i++) {

                sum += numbers[i];
            }

            return sum / i;
        }

        public static int numberWithMostOccurrences(int[] numbers)
        {
            int n = numbers.length;
            int max_count = 0;
            int maxFreq = 0;

            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (numbers[i] == numbers[j]){
                        count++;
                    }
                    if (count > max_count){
                        max_count = count;
                        maxFreq = numbers[i];
                    }
                }
            }
            return maxFreq;
        }
    }

