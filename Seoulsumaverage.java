public class Seoulsumaverage {
  static int[][] mfArr={{74425, 76326}, {61164, 61636},{109688, 115744},{144796, 146776},
  {174996, 181676},{177841, 177434},{204630, 205980},{223373, 232245},{161055, 166130},
  {171576, 176735},{279169, 293772},{239450, 251066},{148690, 156510},
  {182977, 196992},{237792, 242641},{283869, 296762},{209344, 210282},{118965, 114441},
  {186503, 186856},{195734, 203014},{254381, 249472},{212401, 229111},{271654, 295354},
  {319197, 335045},{229829, 231671} };


  static void calculateSum(int[][] mfArr) {
    int mensum=0;
    int womensum=0;
    double number=0.0;
    double menAverage=0.0;
    double womenAverage=0.0;
    for(int i=0;i<mfArr.length;i++) {
      mensum+=mfArr[i][0];
      womensum+=mfArr[i][1];
      number=number+1.0;
    }
    menAverage=(double)mensum/number;
    womenAverage=(double)womensum/number;
    System.out.println("men sum: "+mensum);
    System.out.println("women sum: "+womensum);
    System.out.println("men average"+menAverage);
    System.out.println("women average"+womenAverage);
    }

  public static void main(String[] args){
    Seoulsumaverage a=new Seoulsumaverage();
    a.calculateSum(mfArr);
  }
}
