package ActionItem_Assignments;

public class ActionItem1_LinearArray {
    public static void main(String[] args) {
        String[] nycRegion;
        nycRegion = new String[]{"bronx", "queens", "manhattan", "brooklyn"};
        int[] areaCode;
        areaCode = new int[]{+10462, +11102, +10003, +11222};
        int i = 0;
        while (i < areaCode.length){;
            System.out.print("my region is" + nycRegion[i] + " and my areaCode is" + areaCode[1]);
            i++;
        }
    }
}
