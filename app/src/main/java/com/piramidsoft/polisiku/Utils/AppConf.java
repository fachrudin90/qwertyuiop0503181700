package com.piramidsoft.polisiku.Utils;

/**
 * Created by Web on 15/04/2016.
 */

public class AppConf {


    public static String BASE_URL = "http://118.98.64.43/doctorlocator/";
    public static String URL_PARENT = "index.php/";
    public static String URL_SERV_ROOT = BASE_URL + URL_PARENT;

    public static final int MIN_CHAR = 3;
    public static final int MIN_PHONE = 10;
    public static final int MIN_PASS = 6;


    public static boolean ISDEBUG = true;

    public static String HTTPTAG = "HTTPTAG";

    public static String URL_SERV_IMG = BASE_URL + "assets/images/";

    public static String URL_SERV = BASE_URL + URL_PARENT;
    public static final String URL_UPLOADFILE = URL_SERV + "pasien/upload_image";


    public static String URL_LOGIN = URL_SERV + "auth/login_pasien";
    public static String URL_LOGOUT = URL_SERV + "auth/logout";
    public static String URL_REGISTER = URL_SERV + "auth/register_pasien";
    public static String URL_FORGOT = URL_SERV + "auth/forgot";

    public static String URL_GET_PASIEN = URL_SERV + "pasien/data_by_id";
    public static String URL_EDIT_PASIEN = URL_SERV + "pasien/edit";
    public static String URL_EDIT_TOKEN_PASIEN = URL_SERV + "pasien/edit_token_pasien";
    public static String URL_LISTING_TRANSAKSI = URL_SERV + "pasien/listing_transaksi_pasien_all";
    public static String URL_EDIT_STATUS_CANCEL = URL_SERV + "pasien/edit_status_cancel_pasien";


    public static String URL_SEARCH_DOCTOR = URL_SERV + "pasien/search_doktor_pasien";
    public static String URL_BOOK_APPOINMENT = URL_SERV + "pasien/make_an_appoinment";

    public static String URL_NOTIF_NEW_ORDER = URL_SERV + "notifikasi/notif_new_order";


    public static String URL_LIST_MEDICAL_RECORD = URL_SERV + "pasien/listing_medical_record";
    public static String URL_ADD_MEDICAL_RECORD = URL_SERV + "pasien/add_medical_record";

    public static String URL_CHECKEXPIRED = URL_SERV + "auth/checkexpired";
    public static String URL_NOTESDATA = URL_SERV + "notes/data";
    public static String URL_GETNOTES = URL_SERV + "notes/data_by_id";
    public static String URL_ADDNOTES = URL_SERV + "notes/add";
    public static String URL_EDITNOTES = URL_SERV + "notes/edit";
    public static String URL_DELETENOTES = URL_SERV + "notes/delete";


}
