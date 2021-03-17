package news.mediacorp.com.mediacorp

import java.text.SimpleDateFormat
import java.util.*

object DateUtils {

    /**
     * Get current date and take the last month date
     */
    fun lastMonthDate(): String {
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.MONTH, -1)

        val sdf = SimpleDateFormat("yyyy-MM-dd")
        val currentDate = sdf.format(calendar.time)
        return currentDate;
    }
}