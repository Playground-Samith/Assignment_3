import java.util.Scanner;

public class New_Homework{
    public static void main(String[] args) {

        final String RED="\033[31m";
        final String BLUE="\033[34m";
        final String NO="\033[0m";
        String line = "+----------+----------+---------------------------+\n";

        start:
        {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = input.nextLine();
        String removeSpaceName=name.stripLeading();

        if(removeSpaceName.length()==0){
            System.out.printf("%s%s%s \n",RED,"Invalid Name",NO);
            break start;
        }
    
        System.out.print("Enter Your Age : ");
        int age = input.nextInt();
        input.nextLine();
        String removeSpaceAge=(Integer.toString(age)).stripLeading();
        if(age < 10 || age > 19 ){
            System.out.printf("%s%s%s \n",RED,"Invalid Age",NO);
            break start;
        }
        

        System.out.print("Enter Your Subject1 : ");
        String sub1 = input.nextLine();
        boolean checkSub1=sub1.startsWith("SE-");
        String checkSubName1=sub1.stripLeading();
        
        if(checkSub1 !=true){
            System.out.printf("%s%s%s \n",RED,"Invalid Subject",NO);
            break start;
        }

        System.out.print("Enter Your Marks1 : ");
        double marks1=input.nextDouble();
        input.nextLine();

        if(marks1<0 || marks1>100){
            System.out.printf("%s%s%s \n",RED,"Invalid Marks",NO);
            break start;
        }


        System.out.print("Enter Your Subject2 : ");
        String sub2 = input.nextLine();
        boolean checkSub2=sub2.startsWith("SE-");
        String checkSubName2=sub2.stripLeading();
        
        if(checkSub2 !=true){
            System.out.printf("%s%s%s \n",RED,"Invalid Subject",NO);
            break start;
        }
        if(sub2.equals(sub1)==true){
            System.out.printf("%s%s%s \n",RED,"Subject Already Exist ",NO);
            break start;
        }

        System.out.print("Enter Your Marks2 : ");
        double marks2=input.nextDouble();
        input.nextLine();

        if(marks2<0 || marks2>100){
            System.out.printf("%s%s%s \n",RED,"Invalid Marks",NO);
            break start;
        }

        System.out.print("Enter Your Subject3 : ");
        String sub3 = input.nextLine();
        boolean checkSub3=sub3.startsWith("SE-");
        String checkSubName3=sub3.stripLeading();
        
        if(checkSub3 !=true){
            System.out.printf("%s%s%s \n",RED,"Invalid Subject",NO);
            break start;
        }

        if(sub3.equals(sub1)==true || sub3.equals(sub2)){
            System.out.printf("%s%s%s \n",RED,"Subject Already Exist ",NO);
            break start;
        }

        System.out.print("Enter Your Marks3 : ");
        double marks3=input.nextDouble();
        input.nextLine();

        if(marks3<0 || marks3>100){
            System.out.printf("%s%s%s \n",RED,"Invalid Marks",NO);
            break start;
        }

        String upName=name.toUpperCase();

        System.out.printf("Name : %s%s%s \n",BLUE,upName,NO);
        System.out.printf("Age : %s Years old \n",age);
        double total=marks1+marks2+marks3;
        double avg=(total)/3;
        String overallStatus=null;
        String stu1Status=null;
        String stu2Status=null;
        String stu3Status=null;

        final String GREEN="\033[32m";
        final String YELLOW="\033[33m";
        if(avg>75) overallStatus=BLUE+"Distinguished Pass"+NO;
        else if(avg>65) overallStatus=GREEN+"Credit Pass"+NO;
        else if(avg>55) overallStatus=YELLOW+"Pass"+NO;
        else overallStatus=RED+"Fail"+NO;

        if(marks1>75) stu1Status=BLUE+"Distinguished Pass"+NO;
        else if(marks1>65) stu2Status=GREEN+"Credit Pass"+NO;
        else if(marks1>55) stu1Status=YELLOW+"Pass"+NO;
        else stu1Status=RED+"Fail"+NO;

        if(marks2>75) stu2Status=BLUE+"Distinguished Pass"+NO;
        else if(marks2>65) stu2Status=GREEN+"Credit Pass"+NO;
        else if(marks2>55) stu2Status=YELLOW+"Pass"+NO;
        else stu2Status=RED+"Fail"+NO;

        if(marks3>75) stu3Status=BLUE+"Distinguished Pass"+NO;
        else if(marks3>65) stu3Status=GREEN+"Credit Pass"+NO;
        else if(marks3>55) stu3Status=YELLOW+"Pass"+NO;
        else stu3Status=RED+"Fail"+NO;

        System.out.println("Status :"+overallStatus);
        System.out.printf("Avg :%.2f \n",avg);
        System.out.printf("Total :%.2f    Avg=%.2f%s \n",total,avg,"%");

        int lastNumberSub1 = Integer.valueOf(sub1.substring(3));
        int lastNumberSub2 = Integer.valueOf(sub2.substring(3));
        int lastNumberSub3 = Integer.valueOf(sub3.substring(3));

        System.out.printf(line+"| %-9s| %-9s| %-26s|\n"+line,"Subject","Marks","Status");
        System.out.printf("| SE-%03d%3s| %-9.2f| %-35s|\n",lastNumberSub1, " ",marks1,stu1Status);
        System.out.printf("| SE-%03d%3s| %-9.2f| %-35s|\n",lastNumberSub2," ", marks2,stu2Status);
        System.out.printf("| SE-%03d%3s| %-9.2f| %-35s|\n"+line,lastNumberSub3," ", marks3,stu3Status);

        }
        

    }
}