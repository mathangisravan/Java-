class Grade{
public static void main(String a[]){
    int telugu = 60;
    int social = 70;
    int science = 80;
    int hindi = 80;
    int english = 75;
    int total = telugu + social + science + hindi + english;
    System.out.println(total);
    char grade;
    if( total <= 500 && total >= 450){
        grade = 'A';
        System.out.println(grade);
    }else if(total <=449 && total >= 400){
        grade = 'B';
        System.out.println(grade);
    }else if(total <=399 && total >= 350){
        grade = 'C';
        System.out.println(grade);
    }else if(total <=349 && total >= 300){
        grade = 'D';
        System.out.println(grade);
    }else if(total <=299 && total >= 250){
        grade = 'E';
        System.out.println(grade);
    }else if(total <=249 && total >= 0){
        grade = 'F';
        System.out.println(grade);
    }
    



}
}