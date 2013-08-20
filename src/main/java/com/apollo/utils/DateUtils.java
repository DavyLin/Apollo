/*
 * (C) 2013-2015 Asiainfo-linkage Group Holding Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Authors:
 *   davylin<linjxljx@gmail.com>
 */

package com.apollo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * <pre>
 * </pre>
 *
 * @author linjx
 *         JDK版本:1.6
 * @version 1.0
 * @since 1.0
 */
public class DateUtils {

    private static Map<String, SimpleDateFormat> formats;
    private static final String DATE_FORMATE_STRING_DEFAULT = "yyyyMMddHHmmss";
    private static final String DATE_FORMATE_STRING_A = "yyyy-MM-dd HH:mm:ss";
    private static final String DATE_FORMATE_STRING_B = "yyyy-MM-dd";
    private static final String DATE_FORMATE_STRING_C = "MM/dd/yyyy HH:mm:ss a";
    private static final String DATE_FORMATE_STRING_D = "yyyy-MM-dd HH:mm:ss a";
    private static final String DATE_FORMATE_STRING_E = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static final String DATE_FORMATE_STRING_F = "yyyy-MM-dd'T'HH:mm:ssZ";
    private static final String DATE_FORMATE_STRING_G = "yyyy-MM-dd'T'HH:mm:ssz";
    private static final String DATE_FORMATE_STRING_H = "yyyyMMdd";
    private static final String DATE_FORMATE_STRING_I = "yyyy-MM-dd HH:mm:ss.SSS";
    private static final String DATE_FORMATE_STRING_J = "yyyyMMddHHmmss.SSS";
    public static final String DATE_SEPARATOR = "-/";
    static StringTokenizer sToken;


    /**
     * Date format: "YY"
     */
    public static final String YY = "yy";

    /**
     * Date format: "YYYY"
     */
    public static final String YYYY = "yyyy";

    /**
     * Date format: "MM"
     */
    public static final String MM = "MM";

    /**
     * Date format: "DD"
     */
    public static final String DD = "dd";

    /**
     * Date format: "MM/DD"
     */
    public static final String MM_DD = "MM/dd";

    /**
     * Date format: "YYYYMM"
     */
    public static final String YYYYMM = "yyyyMM";

    public static final String YYYYMMDD = "yyyyMMdd";

    /**
     * Date format: "YYYY/MM"
     */
    public static final String YYYY_MM = "yyyy/MM";

    /**
     * Date format: "YY/MM/DD"
     */
    public static final String YY_MM_DD = "yy/MM/dd";

    /**
     * Date format: "YYYY/MM/DD"
     */
    public static final String YYYY_MM_DD = "yyyy/MM/dd";

    /**
     * Date format: "YYYY-MM-DD"
     */
    public static final String OYYYY_MM_DD = "yyyy-MM-dd";

    public static final String OYYYY_MM_DD_HH_MI_SS = "yyyy-MM-dd HH:mm:ss";

    /**
     * Date format: "HH:MI"
     */
    public static final String HH_MI = "HH:mm";

    /**
     * Date format: "HHMI"
     */
    public static final String HHMI = "HHmm";

    /**
     * Date format: "YY/MM/DD HH:MI"
     */
    public static final String YY_MM_DD_HH_MI = "yy/MM/dd HH:mm";

    /**
     * Date format: "YYYY/MM/DD HH:MI:SS"
     */
    public static final String YYYY_MM_DD_HH_MI = "yyyy/MM/dd HH:mm";

    /**
     * Date format: "YYYY/MM/DD HH:MI:SS"
     */
    public static final String YYYY_MM_DD_HH_MI_SS = "yyyy/MM/dd HH:mm:ss";

    /**
     * Date format: "HH:MI:SS"
     */
    public static final String HH_MI_SS = "HH:mm:ss";

    /**
     * Date format: "YYYYMMDDHHMISS"
     */
    public static final String YYYYMMDDHHMI = "yyyyMMddHHmm";

    /**
     * Date format: "YYYYMMDDHHMISS"
     */
    public static final String YYYYMMDDHHMISS = "yyyyMMddHHmmss";

    /**
     * Date format YYYY年MM月DD日
     */
    public static final String YYYY$MM$DD$ = "yyyy年MM月dd日";

    /**
     * Date format YYYY年MM月
     */
    public static final String YYYY$MM$ = "yyyy年MM月";

    /**
     * Date format MM月DD日
     */
    public static final String MM$DD$ = "MM月dd日";

    /**
     * Date format DD日
     */
    public static final String DD$ = "dd日";

    /**
     * Date format: "YYYY/MM/DD HH:MI:SS"
     */
    public static final String YYYY$MM$DD$_HH_MI_SS = "yyyy年MM月dd日 HH:mm:ss";

    // modified 2004/06/10 詳細情報修正
    /**
     * Date format: "ERAYYMMDD"
     */
    public static final String ERAYYMMDD = "ERAYYMMDD";

    /**
     * Date format: "ERAYYMM"
     */
    public static final String ERAYYMM = "ERAYYMM";

    /**
     * Date format: "HH"
     */
    public static final String HH = "HH";

    /**
     * Date format: "MI"
     */
    public static final String MI = "mm";

    /**
     * Field value: Year
     */
    public static final int YEAR = 1;

    /**
     * Field value: Month
     */
    public static final int MONTH = 2;

    /**
     * Field value: Day
     */
    public static final int DAY = 3;

    /**
     * Field value: Hour
     */
    public final static int HOUR = 10;

    /**
     * Field value: Hour of Day
     */
    public final static int HOUR_OF_DAY = 11;

    /**
     * Field value: Minute
     */
    public final static int MINUTE = 12;

    /**
     * Field value: Second
     */
    public final static int SECOND = 13;


    /**
     * Date format: "YYMM"
     */
    public static final String YYMM = "yyMM";



    /**
     * Get current date
     *
     * @return current date
     */
    public static Date getCurrent() {
        Date currentDate = new Date();
        return currentDate;
    }

    /**
     * Get current date
     *
     * @return current date
     */
    public static Date getCurrentdate() {
        String currentDate = DateUtils.getFormatDate(DateUtils.YYYYMMDD, new Date());
        Date date = DateUtils.getDate(DateUtils.YYYYMMDDHHMISS, currentDate + "000000");
        return date;
    }

    /**
     * Function : Get current date end,such as 23:59:59
     *
     * @return current date end
     */
    public static Date getCurrentdateEnd() {
        String currentDate = DateUtils.getFormatDate(DateUtils.YYYYMMDD, new Date());
        Date date = DateUtils.getDate(DateUtils.YYYYMMDDHHMISS, currentDate + "235959");
        return date;
    }



    /**
     * Get current month's first day
     *
     * @return current month's first day
     *
     */
    public static Date getCurrentMonth() {
        return getMonthFirstDay(new Date());
    }

    /**
     * get the first day of month the date
     *
     * @param date
     * @return
     */
    public static Date getMonthFirstDay(Date date) {
        String month = getFormatDate(DateUtils.YYYYMM, date) + "01";
        Date firstday = null;

        firstday = getDate(DateUtils.YYYYMMDD, month);

        return firstday;
    }

    /**
     * get the end day of month the date
     *
     * @param date
     * @return
     */
    public static Date getMonthEndDay(Date date) {
        Date endday = DateUtils.dateAdd(DateUtils.DAY, -1, DateUtils.dateAdd(DateUtils.MONTH, 1, getMonthFirstDay(date)));
        return endday;
    }


    /**
     *
     * @param month
     * @return
     */
    public static Date getSelectMonth(String month) {
        SimpleDateFormat sdf;
        Date time = new Date();
        sdf = new SimpleDateFormat("yyyy");
        String date = sdf.format(time);
        date = date + "-" + month + "-01 00:00:00.0";
        sdf.applyPattern("yyyy-MM");
        Date curDate = null;
        try {
            curDate = sdf.parse(date);
        } catch (ParseException e) {
        }

        return curDate;
    }

    /**
     *
     * @param birthday
     * @return
     */
    public static String getAge(String birthday) {
        if (birthday == null || "".equals(birthday))
            return "0";
        Date timenow = new Date();
        Date birth = null;

        birth = getDate(DateUtils.YYYYMMDD, birthday);
        int byear = Integer.parseInt(getFormatDate(DateUtils.YYYY, birth));
        int nyear = Integer.parseInt(getFormatDate(DateUtils.YYYY, timenow));
        int bmonth = Integer.parseInt(getFormatDate(DateUtils.MM, birth));
        int nmonth = Integer.parseInt(getFormatDate(DateUtils.MM, timenow));
        int age = nyear - byear;
        if (age < 0)
            return "0";
        if (nmonth < bmonth)
            age--;
        return String.valueOf(age);

    }

    /**
     *
     * @param birthday
     * @return
     */
    public static String getAge(Date birthday) {

        if (birthday == null)
            return "0";
        Date timenow = new Date();
        int byear = Integer.parseInt(getFormatDate(DateUtils.YYYY, birthday));
        int nyear = Integer.parseInt(getFormatDate(DateUtils.YYYY, timenow));
        int bmonth = Integer.parseInt(getFormatDate(DateUtils.MM, birthday));
        int nmonth = Integer.parseInt(getFormatDate(DateUtils.MM, timenow));
        int age = nyear - byear;
        if (age < 0)
            return "0";
        if (nmonth < bmonth)
            age--;
        return String.valueOf(age);

    }

    /**
     *
     * @param birthday
     * @return
     */
    public static String getAge(Date birthday, Date curDate) {

        if (birthday == null)
            return "0";
        Date timenow = curDate;
        int byear = Integer.parseInt(getFormatDate(DateUtils.YYYY, birthday));
        int nyear = Integer.parseInt(getFormatDate(DateUtils.YYYY, timenow));
        int bmonth = Integer.parseInt(getFormatDate(DateUtils.MM, birthday));
        int nmonth = Integer.parseInt(getFormatDate(DateUtils.MM, timenow));
        int age = nyear - byear;
        if (age < 0)
            return "0";
        if (nmonth < bmonth)
            age--;
        return String.valueOf(age);

    }

    /**
     * Get formatted date through custom format
     *
     * @param sFormat
     *            Format
     * @param date
     *            Date which need to be formatted
     * @return Formatted date
     */
    public static String getFormatDate(String sFormat, Date date) {
        if (date == null) {
            return null;
        }
        /*
           * if (sFormat == DateUtils.YY || sFormat == DateUtils.YYYY || sFormat ==
           * DateUtils.MM || sFormat == DateUtils.DD || sFormat == DateUtils.MM_DD ||
           * sFormat == DateUtils.YYYYMM || sFormat == DateUtils.YYYYMMDD || sFormat
           * == DateUtils.YYYY_MM || sFormat == DateUtils.YY_MM_DD || sFormat ==
           * DateUtils.YYYY_MM_DD || sFormat == DateUtils.OYYYY_MM_DD || sFormat ==
           * DateUtils.HH_MI || sFormat == DateUtils.HHMI || sFormat ==
           * DateUtils.YY_MM_DD_HH_MI || sFormat == DateUtils.YYYY_MM_DD_HH_MI_SS ||
           * sFormat == DateUtils.YYYYMMDDHHMISS || sFormat == DateUtils.YYYY$MM$DD$
           * || sFormat == DateUtils.YYYY$MM$ || sFormat == DateUtils.MM$DD$ ||
           * sFormat == DateUtils.DD$ || sFormat == DateUtils.HH || sFormat ==
           * DateUtils.MI || sFormat == DateUtils.HH_MI_SS || sFormat ==
           * DateUtils.YYYY_MM_DD_HH_MI || sFormat ==
           * DateUtils.YYYY$MM$DD$_HH_MI_SS) { SimpleDateFormat formatter = new
           * SimpleDateFormat(sFormat); return formatter.format(date); } else {
           * return null; }
           */
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(sFormat);
            return formatter.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date getDate(String sFormat, String date) {
        if (date == null || "".equals(date)) {
            return null;
        }

        /*
           * if (sFormat == DateUtils.YY || sFormat == DateUtils.YYYY || sFormat ==
           * DateUtils.MM || sFormat == DateUtils.DD || sFormat == DateUtils.MM_DD ||
           * sFormat == DateUtils.YYYYMM || sFormat == DateUtils.YYYYMMDD || sFormat
           * == DateUtils.YYYY_MM || sFormat == DateUtils.YY_MM_DD || sFormat ==
           * DateUtils.YYYY_MM_DD || sFormat == DateUtils.OYYYY_MM_DD || sFormat ==
           * DateUtils.HH_MI || sFormat == DateUtils.YY_MM_DD_HH_MI || sFormat ==
           * DateUtils.YYYY_MM_DD_HH_MI || sFormat == DateUtils.YYYY_MM_DD_HH_MI_SS
           * || sFormat == DateUtils.YYYYMMDDHHMI || sFormat ==
           * DateUtils.YYYYMMDDHHMISS || sFormat == DateUtils.YYYY$MM$DD$ || sFormat
           * == DateUtils.YYYY$MM$ || sFormat == DateUtils.MM$DD$ || sFormat ==
           * DateUtils.DD$ || sFormat == DateUtils.HH || sFormat == DateUtils.MI ||
           * sFormat == DateUtils.YYYY$MM$DD$_HH_MI_SS) { SimpleDateFormat
           * formatter = new SimpleDateFormat(sFormat); try { return
           * formatter.parse(date); } catch (ParseException e) {
           *
           * e.printStackTrace(); } }
           */

        try {
            SimpleDateFormat formatter = new SimpleDateFormat(sFormat);
            return formatter.parse(date);
        } catch (ParseException e) {
            // e.printStackTrace();
            return null;
        }

    }

    /**
     * 月末日取得
     *
     * @return
     */
    public static Date getLastDay(Date date) {
        if (date == null) {
            return null;
        } else {
            return dateAdd(DateUtils.DAY, -1, dateAdd(DateUtils.MONTH, 1, date));
        }
    }

    /**
     * Get current formatted date through custom format
     *
     * @param sFormat
     *            Format
     * @return Formatted date
     */
    public static String getFormatDate(String sFormat) {
        return getFormatDate(sFormat, getCurrent());
    }

    /**
     * Add value on special field of date
     *
     * @param iField
     *            Field which need add value
     * @param iValue
     *            Value which will be added
     * @param date
     *            Basic date
     * @return New date
     */
    public static Date dateAdd(int iField, int iValue, Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        switch (iField) {
            case DateUtils.YEAR:
                cal.add(Calendar.YEAR, iValue);
                break;
            case DateUtils.MONTH:
                cal.add(Calendar.MONTH, iValue);
                break;
            case DateUtils.DAY:
                cal.add(Calendar.DATE, iValue);
                break;
            case DateUtils.HOUR:
                cal.add(Calendar.HOUR, iValue);
                break;
            case DateUtils.HOUR_OF_DAY:
                cal.add(Calendar.HOUR_OF_DAY, iValue);
                break;
            case DateUtils.MINUTE:
                cal.add(Calendar.MINUTE, iValue);
                break;
            case DateUtils.SECOND:
                cal.add(Calendar.SECOND, iValue);
                break;
            default:
                break;
        }
        return cal.getTime();
    }

    /**
     * Date diff
     *
     * @param iField
     * @param startDate
     * @param endDate
     * @return
     */
    public static long dateDiff(int iField, Date startDate, Date endDate) {
        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        // long startTime = startDate.getTime();
        // long endTime = endDate.getTime();
        // long diffTime = endTime - startTime;
        int startYear = Integer.parseInt(getFormatDate(YYYY, startDate));
        int endYear = Integer.parseInt(getFormatDate(YYYY, endDate));
        int startMonth = Integer.parseInt(getFormatDate(MM, startDate)) - 1;
        int endMonth = Integer.parseInt(getFormatDate(MM, endDate)) - 1;
        int startDay = Integer.parseInt(getFormatDate(DD, startDate));
        int endDay = Integer.parseInt(getFormatDate(DD, endDate));
        int startHour = Integer.parseInt(getFormatDate(HH, startDate));
        int endHour = Integer.parseInt(getFormatDate(HH, endDate));
        int startMinute = Integer.parseInt(getFormatDate(MI, startDate));
        int endMinute = Integer.parseInt(getFormatDate(MI, endDate));

        switch (iField) {
            case DateUtils.YEAR:
                return endYear - startYear;
            case DateUtils.MONTH:
                long yearDiff = endYear - startYear;
                long monthDiff = endMonth - startMonth;
                return yearDiff * 12 + monthDiff;
            case DateUtils.DAY:
                start.set(startYear, startMonth, startDay, 0, 0, 0);
                end.set(endYear, endMonth, endDay, 0, 0, 0);
                return (end.getTimeInMillis() - start.getTimeInMillis()) / (1000 * 60 * 60 * 24);
            case DateUtils.HOUR:
                start.set(startYear, startMonth, startDay, startHour, 0, 0);
                end.set(endYear, endMonth, endDay, endHour, 0, 0);
                return (end.getTimeInMillis() - start.getTimeInMillis()) / (1000 * 60 * 60);
            case DateUtils.HOUR_OF_DAY:
                start.set(startYear, startMonth, startDay, startHour, 0, 0);
                end.set(endYear, endMonth, endDay, endHour, 0, 0);
                return (end.getTimeInMillis() - start.getTimeInMillis()) / (1000 * 60 * 60);
            case DateUtils.MINUTE:
                start.set(startYear, startMonth, startDay, startHour, startMinute, 0);
                end.set(endYear, endMonth, endDay, endHour, endMinute, 0);
                return (end.getTimeInMillis() - start.getTimeInMillis()) / (1000 * 60);
            default:
                break;
        }
        return end.getTimeInMillis() - start.getTimeInMillis();
    }

    /**
     * Add value on special field of current date
     *
     * @param iField
     *            iField Field which need add value
     * @param iValue
     *            Value which will be added
     * @return New date
     */
    public static Date dateAdd(int iField, int iValue) {
        return dateAdd(iField, iValue, getCurrent());
    }

    /**
     * Trunc the date
     *
     * @param date
     * @return
     */
    public static Date dateTrunc(Date date) {

        return DateUtils.getDate(DateUtils.YYYYMMDD, DateUtils.getFormatDate(DateUtils.YYYYMMDD, date));

    }

    /**
     * Get the day count of the month
     *
     * @param date
     * @return
     */
    public static long getMonthDayCount(Date date) {
        Date start = getMonthFirstDay(date);
        Date end = getMonthEndDay(date);
        return DateUtils.dateDiff(DateUtils.DAY, start, end) + 1;
    }

    /**
     * Function: return date by specified year,month,day,hour,minute,second<br>
     *
     * @param hour
     * @param minute
     * @param second
     * @param month
     * @param day
     * @param year
     * @return - Date
     */
    public static Date mktime(int hour, int minute, int second, int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day, hour, minute, second);
        return cal.getTime();

    }

    /**
     *
     * Function: SUNDAY or SATURDAY return true
     *
     * @param date
     * @return
     */
    public static boolean isWeekend(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        if (weekday == Calendar.SUNDAY || weekday == Calendar.SATURDAY)
            return true;
        return false;
    }

    /**
     *
     * Function: get the date's weekday
     *
     * @param date
     * @return
     */
    public static int getWeekday(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    /**
     *
     * Function: get LastDay
     *
     * @param date
     * @return
     */
    public static Date getLastDayOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        Calendar lastDay = new GregorianCalendar(year, Calendar.DECEMBER, 31);
        return lastDay.getTime();
    }

    /**
     *
     * Function: get Year firstDay
     *
     * @param createDate
     * @return
     */
    public static Date getFirstDayOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        Calendar firstDay = new GregorianCalendar(year, Calendar.JANUARY, 1);
        return firstDay.getTime();
    }

    /**
     *
     * Function : get Formated Date
     *
     * Product describe:
     *
     * @param sFormat
     * @param date
     * @return
     */
    public static Date getDate(String sFormat, Date date) {
        String dateStr = DateUtils.getFormatDate(sFormat, date);
        return DateUtils.getDate(sFormat, dateStr);
    }


    /**
     * 获取当前日期 格式为:2008年12月22日
     * @author davylin 创建时间：Sep 3, 2009
     * @return
     */
    public static String nowDate() {
        String date = (new Date()).toLocaleString();
        String out = "";
        String xArr[] = date.split(" ");
        String yArr[] = xArr[0].split("-");
        out = (new StringBuffer(String.valueOf(yArr[0]))).append("\u5E74").append(yArr[1]).append("\u6708").append(yArr[2]).append("\u65E5").toString();
        return out;
    }

    /**
     * 获取当前日期 格式为:2008年12月22日 8时52分30秒
     * @author davylin 创建时间：Sep 3, 2009
     * @return
     */
    public static String now() {
        String date = (new Date()).toLocaleString();
        String out = "";
        String xArr[] = date.split("-");
        out = (new StringBuffer(String.valueOf(xArr[0]))).append("\u5E74").append(xArr[1]).append("\u6708").append(xArr[2]).toString();
        String yArr[] = out.split(":");
        out = (new StringBuffer(String.valueOf(yArr[0]))).append("\u65F6").append(yArr[1]).append("\u5206").append(yArr[2]).toString();
        String zArr[] = out.split(" ");
        out = (new StringBuffer(String.valueOf(zArr[0]))).append("\u65E5 ").append(zArr[1]).append("\u79D2").toString();
        return out;
    }

    /**
     * 获取当前日期 格式为：2008年12月22日 星期一
     * @author davylin 创建时间：Sep 3, 2009
     * @return
     */
    public static String nowDateNDay() {
        Date d = new Date();
        String date = d.toLocaleString();
        String out = "";
        String xArr[] = date.split(" ");
        String yArr[] = xArr[0].split("-");
        out = (new StringBuffer(String.valueOf(yArr[0]))).append("\u5E74").append(yArr[1]).append("\u6708").append(yArr[2]).append("\u65E5").toString();
        int w = d.getDay();
        String week = "";
        switch (w) {
            case 0: // '\0'
                week = " \u661F\u671F\u5929";
                break;

            case 1: // '\001'
                week = " \u661F\u671F\u4E00";
                break;

            case 2: // '\002'
                week = " \u661F\u671F\u4E8C";
                break;

            case 3: // '\003'
                week = " \u661F\u671F\u4E09";
                break;

            case 4: // '\004'
                week = " \u661F\u671F\u56DB";
                break;

            case 5: // '\005'
                week = " \u661F\u671F\u4E94";
                break;

            case 6: // '\006'
                week = " \u661F\u671F\u516D";
                break;

            default:
                week = "";
                break;
        }
        out = (new StringBuffer(String.valueOf(out))).append(" ").append(week).toString();
        return out;
    }

    /**
     * 根据日期参数 输出日期格式为:2008年12月22日
     * 例：DateUtils.dateToString(new Date()) 输出：2008年12月22日
     * @author davylin 创建时间：Sep 3, 2009
     * @param date
     * @return
     */
    public static String dateToString(Date date) {
        String d = date.toLocaleString();
        String out = "";
        String xArr[] = d.split(" ");
        String yArr[] = xArr[0].split("-");
        out = (new StringBuffer(String.valueOf(yArr[0]))).append("\u5E74").append(yArr[1]).append("\u6708").append(yArr[2]).append("\u65E5").toString();
        return out;
    }

    /**
     * 将日期格式为2008-1-2 替换为20080102
     * 例：DateUtils.regularize("2008-1-2") 输出：20080102
     * @author davylin 创建时间：Sep 3, 2009
     * @param input
     * @return
     */
    public static String regularize(String input) {
        String out = "";
        String arr[] = input.split("-");
        if (arr[1].length() < 2)
            arr[1] = (new StringBuffer("0")).append(arr[1]).toString();
        if (arr[2].length() < 2)
            arr[2] = (new StringBuffer("0")).append(arr[2]).toString();
        out = (new StringBuffer(String.valueOf(arr[0]))).append(arr[1]).append(arr[2]).toString();
        return out;
    }

    /**
     * 获取昨天日期 格式为：2008-12-21
     * @author davylin 创建时间：Sep 3, 2009
     * @return
     */
    public static String yesterday() {
        Date td = new Date();
        Date tmr = new Date(td.getTime() - 86400000L);
        String tomorrow = tmr.toLocaleString().split(" ")[0];
        String tArr[] = tomorrow.split("-");
        if (tArr[1].length() < 2)
            tArr[1] = (new StringBuffer("0")).append(tArr[1]).toString();
        if (tArr[2].length() < 2)
            tArr[2] = (new StringBuffer("0")).append(tArr[2]).toString();
        return (new StringBuffer(String.valueOf(tArr[0]))).append("-").append(tArr[1]).append("-").append(tArr[2]).toString();
    }

    /**
     * 获取明天日期 格式为：2008-12-23
     * @author davylin 创建时间：Sep 3, 2009
     * @return
     */
    public static String tomorrow() {
        Date td = new Date();
        Date tmr = new Date(td.getTime() + 86400000L);
        String tomorrow = tmr.toLocaleString().split(" ")[0];
        String tArr[] = tomorrow.split("-");
        if (tArr[1].length() < 2)
            tArr[1] = (new StringBuffer("0")).append(tArr[1]).toString();
        if (tArr[2].length() < 2)
            tArr[2] = (new StringBuffer("0")).append(tArr[2]).toString();
        return (new StringBuffer(String.valueOf(tArr[0]))).append("-").append(tArr[1]).append("-").append(tArr[2]).toString();
    }

    /**
     * 将日期格式为2008-12-1 转化为 2008年12月1日
     * 例：DateUtils.dateToDateCN("2008-12-1") 输出：2008年12月1日
     * @author davylin 创建时间：Sep 3, 2009
     * @param in
     * @return
     */
    public static String dateToDateCN(String in) {
        String tmp[] = in.split("-");
        return (new StringBuffer(String.valueOf(tmp[0]))).append("\u5E74").append(tmp[1]).append("\u6708").append(tmp[2]).append("\u65E5").toString();
    }

    /**
     * 将日期格式为2008年12月1日 转化为 2008-12-1
     * 例：DateUtils.dateToDateCN("2008年12月1日") 输出：2008-12-1
     * @author davylin 创建时间：Sep 3, 2009
     * @param in
     * @return
     */
    public static String dateToDateEN(String in) {
        return in.replaceAll("\u5E74", "-").replaceAll("\u6708", "-").replaceAll("\u65E5", "");
    }

    /**
     * 将字符串格式的日期转换为Calender
     * 例：parse2Cal("2008-12-1")
     * @author davylin 创建时间：Sep 3, 2009
     * @param pDateStr
     * @return
     */
    public static GregorianCalendar parse2Cal(String pDateStr) {
        sToken = new StringTokenizer(pDateStr, "-/");
        int vYear = Integer.parseInt(sToken.nextToken());
        int vMonth = Integer.parseInt(sToken.nextToken()) - 1;
        int vDayOfMonth = Integer.parseInt(sToken.nextToken());
        return new GregorianCalendar(vYear, vMonth, vDayOfMonth);
    }

    /**
     * 给定两个时间相差的月数,String版
     * 例：DateUtils.monthsBetween("2008-12-1","2009-1-1")输出：1
     * @author davylin 创建时间：Sep 3, 2009
     * @param pFormerStr
     * @param pLatterStr
     * @return
     */
    public static int monthsBetween(String pFormerStr, String pLatterStr) {
        GregorianCalendar vFormer = parse2Cal(pFormerStr);
        GregorianCalendar vLatter = parse2Cal(pLatterStr);
        return monthsBetween(vFormer, vLatter);
    }

    /**
     * 给定两个时间相差的月数
     * 例：DateUtils.monthsBetween(parse2Cal("2008-12-1"),parse2Cal("2009-1-1"))输出：1
     * @author davylin 创建时间：Sep 3, 2009
     * @param pFormer
     * @param pLatter
     * @return
     */
    public static int monthsBetween(GregorianCalendar pFormer, GregorianCalendar pLatter) {
        GregorianCalendar vFormer = pFormer;
        GregorianCalendar vLatter = pLatter;
        boolean vPositive = true;
        if (pFormer.before(pLatter)) {
            vFormer = pFormer;
            vLatter = pLatter;
        } else {
            vFormer = pLatter;
            vLatter = pFormer;
            vPositive = false;
        }
        int vCounter;
        for (vCounter = 0; vFormer.get(1) != vLatter.get(1) || vFormer.get(2) != vLatter.get(2); vCounter++)
            vFormer.add(2, 1);

        if (vPositive)
            return vCounter;
        else
            return -vCounter;
    }

    /**
     * 返回给定日期的月份
     * 例：DateUtils.getMonth("2008-12-2")输出：12
     * @author davylin 创建时间：Sep 3, 2009
     * @param pFormattedDate
     * @return
     */
    public static int getMonth(String pFormattedDate) {
        StringTokenizer vSt = new StringTokenizer(pFormattedDate, "-");
        vSt.nextToken();
        int val = Integer.parseInt(vSt.nextToken());
        return val;
    }

    /**
     * 返回给定日期的年份
     * 例：DateUtils.getYear("2008-12-2")输出：2008
     * @author davylin 创建时间：Sep 3, 2009
     * @param pFormattedDate
     * @return
     */
    public static int getYear(String pFormattedDate) {
        StringTokenizer vSt = new StringTokenizer(pFormattedDate, "-");
        int val = Integer.parseInt(vSt.nextToken());
        return val;
    }

    /**
     * 返回给定日期的周数
     * 例：DateUtils.dayOfWeek("2008-12-2")输出：3
     * @author davylin 创建时间：Sep 3, 2009
     * @param pFormerStr
     * @return
     */
    public static int dayOfWeek(String pFormerStr) {
        GregorianCalendar vTodayCal = parse2Cal(pFormerStr);
        return vTodayCal.get(7);
    }

    /**
     * 返回给定日期的周数
     * 例：DateUtils.dayOfWeek(new Date("2008-12-2"))输出：3
     * @author davylin 创建时间：Sep 3, 2009
     * @param date
     * @return
     */
    public static int dayOfWeek(Date date) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        return gc.get(7);
    }

    /**
     * 字符串转日期
     * 简要说明：注意：这里的pattern参数要与date参数格式相一致，如举例
     * 显示格式如：yyyy-MM-dd hh:mm:ss, MM-dd-yyyy hh:mm:ss, yy-MM-dd HH:mm, yyyy-MM-dd, yyyy/MM/dd, MM/dd/yyyy, yyyyMMdd等
     * 例：正确：DateUtils.stringToDate("2008-9-2","yy-MM-dd");
     * DateUtils.stringToDate("2008-9-2 12:30","yy-MM-dd");
     * 错误：DateUtils.stringToDate("2008-9-2 12:30","yyyy/MM/dd");
     * DateUtils.stringToDate("2008/9/2 12:30","yyyyMMdd HH:mm");
     * @author davylin 创建时间：Sep 3, 2009
     * @param date
     * @param pattern
     * @return
     * @throws java.text.ParseException
     */
    public static final Date stringToDate(String date, String pattern) throws ParseException {
        if (date == null || pattern == null) {
            return null;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.parse(date);
        }
    }

    /**
     * 日期转字符串
     * 显示格式如：yyyy-MM-dd hh:mm:ss, MM-dd-yyyy hh:mm:ss, yy-MM-dd HH:mm, yyyy-MM-dd, yyyy/MM/dd, MM/dd/yyyy, yyyyMMdd等
     * 例：DateUtils.convDateToString(new Date(),"yy-MM-dd HH:mm")
     * @author davylin 创建时间：Sep 3, 2009
     * @param date
     * @param pattern
     * @return
     */
    public static final String convDateToString(Date date, String pattern) {
        if (date == null || pattern == null) {
            return null;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.format(date);
        }
    }

    /**
     * 根据日期计算这个星期的星期一是多少，并且星期一以00:00:00开头 例：DateUtils.calcMonday("2008-12-2")输出：2008-12-01 00:00:00
     * @author davylin 创建时间：Sep 3, 2009
     * @param queryDate
     * @return
     */
    public static String calcMonday(String queryDate) {
        String result = null;
        if (queryDate != null) {
            GregorianCalendar gc = new GregorianCalendar();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            try {
                gc.setTime(df.parse(queryDate));
                gc.add(5, -1);
                for (; gc.get(7) != 1; gc.add(5, -1))
                    ;
                gc.add(5, 1);
                result = (new StringBuffer(String.valueOf(df.format(gc.getTime())))).append(" 00:00:00").toString();
            } catch (ParseException e) {
                System.out.print(e.getMessage());
            }
        }
        return result;
    }

    /**
     * 根据日期计算这个星期的星期日是多少，并且星期日以23:59:59开头 例：DateUtils.calcSunday("2008-12-2")输出：2008-12-07 23:59:59
     * @author davylin 创建时间：Sep 3, 2009
     * @param queryDate
     * @return
     */
    public static String calcSunday(String queryDate) {
        String result = null;
        if (queryDate != null) {
            GregorianCalendar gc = new GregorianCalendar();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            try {
                gc.setTime(df.parse(queryDate));
                gc.add(5, -1);
                for (; gc.get(7) != 7; gc.add(5, 1))
                    ;
                gc.add(5, 1);
                result = (new StringBuffer(String.valueOf(df.format(gc.getTime())))).append(" 23:59:59").toString();
            } catch (ParseException e) {
                System.out.print(e.getMessage());
            }
        }
        return result;
    }

    /**
     * 根据日期计算这个月的第一天  例：DateUtils.calcBeginMonth("2008-12-2")输出：Mon Dec 01 00:00:00 GMT 2008
     * @author davylin 创建时间：Sep 3, 2009
     * @param queryDate
     * @return
     */
    public static Date calcBeginMonth(String queryDate) {
        Date result = null;
        if (queryDate != null) {
            GregorianCalendar gc = new GregorianCalendar();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            try {
                gc.setTime(df.parse(queryDate));
                for (int i = gc.get(2); gc.get(2) != (i != 0 ? i - 1 : 11); gc.add(5, -1))
                    ;
                gc.add(5, 1);
                result = gc.getTime();
            } catch (ParseException e) {
                System.out.print(e.getMessage());
            }
        }
        return result;
    }

    /**
     * 根据日期计算这个月的最后一天  例：DateUtils.calcEndMonth("2008-12-2")输出：Wed Dec 31 00:00:00 GMT 2008
     * @author davylin 创建时间：Sep 3, 2009
     * @param queryDate
     * @return
     */
    public static Date calcEndMonth(String queryDate) {
        Date result = null;
        if (queryDate != null) {
            GregorianCalendar gc = new GregorianCalendar();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            try {
                gc.setTime(df.parse(queryDate));
                for (int i = gc.get(2); gc.get(2) != (i != 11 ? i + 1 : 0); gc.add(5, 1))
                    ;
                gc.add(5, -1);
                result = gc.getTime();
            } catch (ParseException e) {
                System.out.print(e.getMessage());
            }
        }
        return result;
    }

    private static String getWeekString(int week) {
        String weeks[] = { "\u661F\u671F\u65E5", "\u661F\u671F\u4E00", "\u661F\u671F\u4E8C", "\u661F\u671F\u4E09", "\u661F\u671F\u56DB", "\u661F\u671F\u4E94", "\u661F\u671F\u516D" };
        return weeks[week - 1];
    }

    /**
     * 判断时间date1是否在时间date2之前
     * 使用说明：时间格式 2005-4-21 16:16:34
     * 例:DateUtils.isDateBefore("2008-12-2 16:16:34","2008-12-1 16:16:34")输出：false
     * @author davylin 创建时间：Sep 3, 2009
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isDateBefore(String date1, String date2) {
        try {
            return stringToDate(date1, "yyyy-MM-dd HH:mm:ss").before(stringToDate(date2, "yyyy-MM-dd HH:mm:ss"));
        } catch (ParseException e) {
            System.out.print(e.getMessage());
        }
        return false;
    }

    /**
     * 判断时间date1是否在时间date2之前
     * 例:DateUtils.isDateBefore(DateUtils.getDate(),DateUtils.getDate())输出：false
     * @author davylin 创建时间：Sep 3, 2009
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isDateBefore(Date date1, Date date2) {
        try {
            return date1.before(date2);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return false;
    }

    /**
     * 得到几天后的时间
     * 例:DateUtils.getDateBefore(DateUtils.getDate(),2)输出：Sat Feb 21 07:14:57 GMT 2009
     * DateUtils.getDate()为Thu Feb 19 07:14:57 GMT 2009
     * @author davylin 创建时间：Sep 3, 2009
     * @param d
     * @param day
     * @return
     */
    public static Date getDateBefore(Date d, int day) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(5, now.get(5) + day);
        return now.getTime();
    }

    /**
     * 指定日期小时后的时间
     * 例:DateUtils.getDateBeforeHour(DateUtils.getDate(),2)输出：Thu Feb 19 09:17:36 GMT 2009
     * DateUtils.getDate()为Thu Feb 19 07:17:36 GMT 2009
     * @author davylin 创建时间：Sep 3, 2009
     * @param d
     * @param hour
     * @return
     */
    public static Date getDateBeforeHour(Date d, int hour) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(10, now.get(10) + hour);
        return now.getTime();
    }

    /**
     * 获取当前时间 -年
     * @author davylin 创建时间：Sep 3, 2009
     * @return
     */
    public static String getYear() {
        Date date = Calendar.getInstance().getTime();
        String sDate = convDateToString(date, "yyyy");
        return sDate;
    }

    /**
     * 获取当前时间 -月
     * @author davylin 创建时间：Sep 3, 2009
     * @return
     */
    public static String getMon() {
        Date date = Calendar.getInstance().getTime();
        String sDate = convDateToString(date, "MM");
        return sDate;
    }

    /**
     * 获取当前时间 -日
     * @author davylin 创建时间：Sep 3, 2009
     * @return
     */
    public static String getDaily() {
        Date date = Calendar.getInstance().getTime();
        String sDate = convDateToString(date, "dd");
        return sDate;
    }

    /**
     * 获取当前日期 格式为:2008-12-22
     * @author davylin 创建时间：Sep 3, 2009
     * @return
     */
    public static String getNow() {
        Date date = Calendar.getInstance().getTime();
        String sDate = convDateToString(date, "yyyy-MM-dd");
        return sDate;
    }

    /**
     * 获取当前日期 格式为:2008-12-22 00:00:00
     * @author davylin 创建时间：Sep 3, 2009
     * @return
     */
    public static String getNowTime() {
        Date date = Calendar.getInstance().getTime();
        String sDate = convDateToString(date, "yyyy-MM-dd HH:mm:ss");
        return sDate;
    }

    /**
     * 获取当前日期 格式为:Thu Feb 19 02:01:37 GMT 2009
     * @author davylin 创建时间：Sep 3, 2009
     * @return
     */
    public static Date getDate() {
        Date date = Calendar.getInstance().getTime();
        return date;
    }

    /**
     * 获取下一天
     * @author davylin 创建时间：Sep 17, 2009
     * @param dateStr
     * @return
     */
    public static String getNextDay(String dateStr) {
        Calendar calendar = new GregorianCalendar();
        String format = "yyyy-MM-dd";
        if (dateStr != null && dateStr.trim().length() == 7) {
            format = "yyyy-MM";
        }
        SimpleDateFormat bartDateFormat = new SimpleDateFormat(format);
        try {
            Date date = bartDateFormat.parse(dateStr);
            calendar.setTime(date);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        calendar.add(Calendar.DATE, +1);
        return bartDateFormat.format(calendar.getTime()).toString();
    }

    static {
        formats = new HashMap<String, SimpleDateFormat>();

        formats.put(DATE_FORMATE_STRING_DEFAULT, new SimpleDateFormat(DATE_FORMATE_STRING_DEFAULT));
        formats.put(DATE_FORMATE_STRING_A, new SimpleDateFormat(DATE_FORMATE_STRING_A));
        formats.put(DATE_FORMATE_STRING_B, new SimpleDateFormat(DATE_FORMATE_STRING_B));
        formats.put(DATE_FORMATE_STRING_C, new SimpleDateFormat(DATE_FORMATE_STRING_C));
        formats.put(DATE_FORMATE_STRING_D, new SimpleDateFormat(DATE_FORMATE_STRING_D));
        formats.put(DATE_FORMATE_STRING_E, new SimpleDateFormat(DATE_FORMATE_STRING_E));
        formats.put(DATE_FORMATE_STRING_F, new SimpleDateFormat(DATE_FORMATE_STRING_F));
        formats.put(DATE_FORMATE_STRING_G, new SimpleDateFormat(DATE_FORMATE_STRING_G));
        formats.put(DATE_FORMATE_STRING_H, new SimpleDateFormat(DATE_FORMATE_STRING_H));
        formats.put(DATE_FORMATE_STRING_I, new SimpleDateFormat(DATE_FORMATE_STRING_I));
        formats.put(DATE_FORMATE_STRING_J, new SimpleDateFormat(DATE_FORMATE_STRING_J));
    }

    /**
     * 将Date转换为 pattern 格式的字符串，格式为：
     *  yyyyMMddHHmmss
     *	yyyy-MM-dd HH:mm:ss
     *	yyyy-MM-dd
     *	MM/dd/yyyy HH:mm:ss a
     *	yyyy-MM-dd HH:mm:ss a
     *	yyyy-MM-dd'T'HH:mm:ss'Z'
     *	yyyy-MM-dd'T'HH:mm:ssZ
     *	yyyy-MM-dd'T'HH:mm:ssz
     * @param date 日期
     * @param pattern 日期格式
     * @return String --格式化的日期字符串
     * @see java.util.Date
     */
    public static String getFormatTimeString(Date date, String pattern) {
        SimpleDateFormat sDateFormat = getDateFormat(pattern);
        //单实例,SimpleDateFormat非线程安全
        synchronized (sDateFormat) {
            return sDateFormat.format(date);
        }
    }

    /**
     * 将Date转换为默认的YYYYMMDDHHMMSS 格式的字符串
     * @param date
     * @return
     */
    public static String getDefaultFormateTimeString(Date date) {
        return getFormatTimeString(date, DATE_FORMATE_STRING_DEFAULT);
    }

    /**
     * 根据pattern取得的date formate
     * @param pattern
     * @return
     */
    public static SimpleDateFormat getDateFormat(String pattern) {
        SimpleDateFormat sDateFormat = formats.get(pattern);
        if (sDateFormat == null) {
            sDateFormat = new SimpleDateFormat(pattern);
            formats.put(pattern, sDateFormat);
        }
        return sDateFormat;
    }

    /**
     * 将格式将日期字符串转换为Date对象
     *
     * @param date 字符串
     * @param pattern 格式如下：
     * 	yyyyMMddHHmmss
     *	yyyy-MM-dd HH:mm:ss
     *	yyyy-MM-dd
     *	MM/dd/yyyy HH:mm:ss a
     *	yyyy-MM-dd HH:mm:ss a
     *	yyyy-MM-dd'T'HH:mm:ss'Z'
     *	yyyy-MM-dd'T'HH:mm:ssZ
     *	yyyy-MM-dd'T'HH:mm:ssz
     * @return 日期Date对象
     * @throws java.text.ParseException
     * @see java.util.Date
     */
    public static Date getDateFromString(String date, String pattern) throws ParseException {
        SimpleDateFormat sDateFormat = getDateFormat(pattern);
        //单实例,SimpleDateFormat非线程安全
        synchronized (sDateFormat) {
            return sDateFormat.parse(date);
        }
    }

    /**
     * 将日期字符串转化成默认格式YYYYMMDDHHMMSS的Date对象
     * @param date
     * @return
     * @throws java.text.ParseException
     */
    public static Date getDefaultDateFromString(String date) throws ParseException {
        return getDateFromString(date, DATE_FORMATE_STRING_DEFAULT);
    }

    /**
     * 取当前时间,格式为YYYYMMDDHHMMSS的日期字符串
     *
     * @return 当前日期字符串
     * @throws java.text.ParseException
     * @see java.util.Date
     */
    public static String getNowDefault() {
        return getNow(DATE_FORMATE_STRING_DEFAULT);
    }

    /**
     * 按照pattern格式取当前日期字符串
     * @param pattern	日期字符串格式
     * @return			格式化后的当前日期字符串
     */
    public static String getNow(String pattern) {
        return getFormatTimeString(new Date(), pattern);
    }

    /**
     * 取当前时间,格式为YYYYMMDD
     *
     * @return 当前日期字符串
     * @throws java.text.ParseException
     * @see java.util.Date
     */
    public static String getNowII() {
        return getFormatTimeString(new Date(), DATE_FORMATE_STRING_H);
    }

    /**
     * 将输入pattern格式的日期字符串转换为取时间的毫秒数 since 1976
     *
     * @return 时间毫秒数
     * @throws java.text.ParseException
     * @see java.util.Date
     */
    public static long dateString2Long(String str, String pattern) throws ParseException {
        return getDateFromString(str, pattern).getTime();
    }

    /**
     * 把since1976的毫秒数转成默认格式yyyyMMddHHmmss的String日期字符串
     * @param time
     * @return
     */
    public static String longToDateStringDefault(long time) {
        return getFormatTimeString(new Date(time), DATE_FORMATE_STRING_DEFAULT);
    }

    /**
     * 将时间的毫秒数 since 1976转换为按照pattern格式的日期字符串
     *
     * @return 日期字符串
     * @see java.util.Date
     */
    public static String longToDateString(long time, String pattern) {
        return getFormatTimeString(new Date(time), pattern);
    }

    /**
     * 将Date对象转成since 1976的毫秒数
     * @param date
     * @return	since1976的毫秒数
     */
    public static long date2Long(Date date) {
        return date.getTime();
    }

    /**
     * 将since1976毫秒数转成Date对象
     * @param time
     * @return
     */
    public static Date longToDate(long time) {
        return new Date(time);
    }

    /**
     * 自动适配两种格式的日期字符串转换为date对象
     * A格式	:	yyyy-MM-dd HH:mm:ss
     * B格式	:	yyyy-MM-dd
     * @param date
     * @return
     * @throws java.text.ParseException
     */
    public static Date getDateFromStringAdaptTwoPattern(String date) throws ParseException {
        try {
            return getDateFromString(date, DATE_FORMATE_STRING_A);
        } catch (ParseException e) {
            return getDateFromString(date, DATE_FORMATE_STRING_B);
        }
    }
    public static void main(String args[]) throws ParseException {
        System.out.println(stringToDate("2008-12-12 06:30", "yy-MM-dd"));
    }

}