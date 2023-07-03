package com.softserve.Practical.P4.task1_2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4 {
    public static int[] inputArray()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size1;
        System.out.print("Size of array: ");
        size1 = Integer.parseInt(br.readLine());
        int[] number = new int[size1];

        for(int i = 0; i<size1;i++){
            System.out.print((i+1)+". Element: ");
            number[i] = Integer.parseInt(br.readLine());
        }
        return number;
    }
    public static void oddNumber(int... numbers){
        System.out.print("Odd number: ");
        for (int num: numbers){
            if (num%2 == 0){
                System.out.print(num+", ");
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Task: ");
        int choice = Integer.parseInt(br.readLine());
        switch(choice){
            case 1:
                int[] number1 = inputArray();
                oddNumber(number1);
                break;
            case 2:
                DayOfWeek today = DayOfWeek.MONDAY;
                System.out.print("Input number of day: ");
                int day = Integer.parseInt(br.readLine());
                switch (day) {
                    case 1:
                        today = DayOfWeek.MONDAY;
                        break;
                    case 2:
                        today = DayOfWeek.TUESDAY;
                        break;
                    case 3:
                        today = DayOfWeek.WEDNESDAY;
                        break;
                    case 4:
                        today = DayOfWeek.THURSDAY;
                        break;
                    case 5:
                        today = DayOfWeek.FRIDAY;
                        break;
                    case 6:
                        today = DayOfWeek.SATURDAY;
                        break;
                    case 7:
                        today = DayOfWeek.SUNDAY;
                        break;
                    default:
                        System.out.println("ERROR");
                        break;
                }
                System.out.println(today);
                break;
            case 3:
                System.out.print("Country: ");
                String country = br.readLine();
                Continents con;
                 con = switch (country){
    /*AZIA*/            case "China", "India", "Indonesia", "Pakistan", "Bangladesh", "Japan", "Philippines", "Vietnam", "Turkey", "Iran", "Thailand", "Myanmar (Burma)", "South Korea", "Iraq", "Afghanistan", "Saudi Arabia", "Uzbekistan", "Malaysia", "Yemen", "North Korea", "Sri Lanka", "Kazakhstan", "Syria", "Cambodia", "Jordan", "Azerbaijan", "United Arab Emirates", "Tajikistan", "Israel", "Laos", "Lebanon", "Kyrgyzstan", "Turkmenistan", "Singapore", "State of Palestine", "Oman", "Kuwait", "Georgia", "Mongolia", "Armenia", "Qatar", "Bahrain", "Timor-Leste", "Cyprus", "Bhutan", "Maldives", "Brunei" -> Continents.ASIA;
    /*AFRICA*/          case "Algeria", "Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cabo Verde", "Cameroon", "Central African Republic", "Chad", "Comoros", "Democratic Republic of the Congo", "Republic of the Congo", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea", "Eswatini (formerly Swaziland)", "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Ivory Coast (Côte d'Ivoire)", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar", "Malawi", "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia", "Niger", "Nigeria", "Rwanda", "Sao Tome and Principe", "Senegal", "Seychelles", "Sierra Leone", "Somalia", "South Africa", "South Sudan", "Sudan", "Tanzania", "Togo", "Tunisia", "Uganda", "Zambia", "Zimbabwe"-> Continents.AFRICA;
    /*NORTH_AMERICA*/   case "Canada", "United States", "Mexico", "Guatemala", "Belize", "El Salvador", "Honduras", "Nicaragua", "Costa Rica", "Panama", "Jamaica", "Haiti", "Dominican Republic", "Bahamas", "Cuba", "Trinidad and Tobago", "Dominica", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Antigua and Barbuda", "Barbados", "Grenada", "Bermuda (UK)", "Greenland (Denmark)", "Aruba (Netherlands)", "Curaçao (Netherlands)", "Sint Maarten (Netherlands)", "Saint Pierre and Miquelon (France)" ->Continents.NORTH_AMERICA;
    /*SOUNTH_AMERICA*/  case "Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Peru", "Suriname", "Uruguay", "Venezuela"->Continents.SOUNTH_AMERICA;
    /*AUSTRALIA*/       case "Australia"->Continents.AUSTRALIA;
    /*EUROPE*/          default -> Continents.EUROPE;
                 };
                 System.out.println(con);
            default:
                System.out.print("Such a task does not exist");
                break;
        }
    }
}
