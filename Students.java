public class Students {

    private
    String fld_s_name = "";
    String fld_s_family = "";
    String fld_s_faders_name = "";
    String fld_s_fsk = "";
    int    fld_s_id = 0;
    byte   fld_s_grade = 0;


    public

    int mtd_StudentAssign  ( String in_s_name ,  String in_s_family, String  in_s_faders_name, String in_s_fsk , int in_s_id , byte in_s_grade)
    {
        fld_s_name = in_s_name;
        fld_s_family = in_s_family ;
        fld_s_faders_name = in_s_faders_name;
        fld_s_fsk = in_s_fsk ;
        fld_s_id = in_s_id ;
        fld_s_grade = in_s_grade ;

        System.out.println();

        return 0 ;
    }






}
