package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    int dayOfWeekValue = date.getDayOfWeek().getValue();
    long gapValue = DayOfWeek.SUNDAY.getValue() - dayOfWeekValue;
    if (gapValue <= 2) {
      return date.plusDays(gapValue + 1);
    }
    return date.plusDays(1);
  }
}
