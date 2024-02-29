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

        System.out.println("Thank you for waiting we really appreciate your patience but get out of the DMV and don't come back until you have the required paperwork<3 have a great day! muahahahahahahahaha");
    }
}
