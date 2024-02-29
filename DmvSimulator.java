public class DmvSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV!");

        int assignedNum = (int) (Math. random() * 200);

        System.out.println("Your number is " + assignedNum);

        int startNum = assignedNum + 1;
        
        while(startNum != assignedNum)
        {
            System.out.println(startNum);

            if (startNum == 200)
            {
                startNum = 1;
            } else {
                startNum = startNum + 1;
            }
        }
        
        int correctPaperwork = (int) (Math. random() * 100);

        if(correctPaperwork == 16)
        {
            System.out.println("Hey!!!! Thanks so much for having the correct paperwork! You wouldn't believe how many people wait all this time and then get it wrong. You're all set!!");
        } else {
            System.out.println("Thank you for waiting we really appreciate your patience but get out of the DMV and don't come back until you have the required paperwork<3 have a great day! muahahahahahahahaha");
        }    

    }
}
