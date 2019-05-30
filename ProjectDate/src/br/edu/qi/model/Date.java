package br.edu.qi.model;
/**
 * @author Rafael Pinheiro
 * @since 19/05/2019- 9:53
 * @version 1.0 Beta 
 */
public class Date {
    private int day;
    private int month;

    public Date() {
    }
    
    /**
     * 
     * @param day recive one day of month
     * @param month recive one month of year
     */
    public Date(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    /**
     * 
     * @return return a string based in the month and day informed by user
     */
    public String validateDate() {
        switch (this.month) {
            case 1:
                if (this.day > 0 && this.day < 32)
                    return "Data válida \n"
                            + "Janeiro!";
                return "Data inválida!";
            case 2:
                if (this.day > 0 && this.day < 29)
                    return "Data válida \n"
                            + "Fevereiro!";
                return "Data inválida!";
            case 3:
                if (this.day > 0 && this.day < 32)
                    return "Data válida \n"
                            + "Março!";
                return "Data inválida!";
            case 4:
                if (this.day > 0 && this.day < 31)
                    return "Data válida \n"
                            + "Abril!";
                return "Data inválida!";
            case 5: 
                if (this.day > 0 && this.day < 32)
                    return "Data válida \n"
                            + "Maio!";
                return "Data inválida!";
            case 6:
                if (this.day > 0 && this.day < 31)
                    return "Data válida \n"
                            + "Junho!";
                return "Data inválida!";
            case 7:
                if (this.day > 0 && this.day < 32)
                    return "Data válida \n"
                            + "Julho!";
                return "Data inválida!";
            case 8:
                if (this.day > 0 && this.day < 32)
                    return "Data válida \n"
                            + "Agosto!";
                return "Data inválida!";
            case 9:
                if (this.day > 0 && this.day < 31)
                    return "Data válida \n"
                            + "Setembro!";
                return "Data inválida!";
            case 10:
                if (this.day > 0 && this.day < 32)
                    return "Data válida \n"
                            + "Outubro!";
                return "Data inválida!";
            case 11:
                if (this.day > 0 && this.day < 31)
                    return "Data válida \n"
                            + "Novembro!";
                return "Data inválida!";
            case 12: 
                if (this.day > 0 && this.day < 32)
                    return "Data válida \n"
                            + "Dezembro!";
                return "Data inválida!";
            default:
                return "Data inválida!";
        }
    }
   

    /**
     * 
     * @return information based in object
     */
    @Override
    public String toString() {
        return "Dia: " + day + 
               "\nMês: " + month + 
               "\n" + validateDate();
    } 
}
