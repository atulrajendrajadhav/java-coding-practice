class FrequencyDigitUseMethod {
    public static void main(String[] args) {
        int num = 38783346;
        frequencyDigit(num);
        //distinctDigit(num);
        //uniqueDigit(num);
        //duplicateDigit(num);
        //hightRepeatingDigit(num);
        // leastReapeatingDigit(num);
    }

    public static void leastReapeatingDigit(int  num){
        int highestDigit = -1;
        int freq = 9;
        for(int i=0; i<=9; i++){
            int dup = num, cnt = 0;
            while (dup!=0) {
                int rem = dup%10;
                if(i==rem) cnt++;
                dup/=10;
            }
            if(cnt!=0 && freq>cnt){
                freq = cnt;
                highestDigit = i;
            }
        }
        System.out.println(highestDigit+ " : "+freq);
    }

    public static void hightRepeatingDigit(int num){
        int highestDigit = -1;
        int freq =0;
        for(int i=0; i<=9; i++){
            int dup = num, cnt = 0;
            while (dup!=0) {
                int rem = dup%10;
                if(i==rem) cnt++;
                dup/=10;
            }
            if(cnt!=0 && freq< cnt){
                freq = cnt;
                highestDigit = i;
            }
        }
        System.out.println(highestDigit+" : "+freq);
    }


    public static void duplicateDigit(int num){
        for(int i=0; i<=9 ; i++){
            int dup = num, cnt = 0;
            while(dup!=0){
                int rem = dup%10;
                if(i==rem) cnt++;
                dup/=10;
            }
            if(cnt>1)
                System.out.println(i+" ");
        }
    }

    public static void uniqueDigit(int num){
        for(int i =0; i<=9; i++){
            int dup = num, cnt = 0;
            while (dup!=0) {
                int rem = dup%10;
                if(i==rem) cnt++;
                dup/=10;
            }
            if(cnt ==1)
                System.out.println(i+" ");
        }
    }

    public static void distinctDigit(int num){
        for(int i=0; i<=9; i++){
            int dup = num, cnt = 0;
            while (dup != 0) {
                int rem = dup%10;
                if(i==rem) cnt++;
                dup/=10;
            }
            if(cnt!=0)
                System.out.println(i+" ");
        }
    }

    public static void frequencyDigit(int num) {
        for (int i = 0; i <= 9; i++) {
            int dup = num, cnt = 0;
            while (dup != 0) {
                int rem = dup % 10;
                if (i == rem)
                    cnt++;
                dup /= 10;

            }
            if (cnt != 0)
                System.out.println(i + " : " + cnt);
        }
    }
}