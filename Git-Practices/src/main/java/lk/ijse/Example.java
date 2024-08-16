package lk.ijse;

public class Example {
    public static void main(String[] args) {
        System.out.println("create new branch");
        NewBranch();
        commitChanges();
    }

    private static void NewBranch() {
        System.out.println("git checkout -b registration");
        goesToThatBranch();

    }

    private static void goesToThatBranch() {
        System.out.println("git checkout registration");
    }

    public static String commitChanges() {
         String  Stage_Your_Changes="git add .";
         String Commit_Your_Changes="git commit -m \"Your commit message here\"\n";
         String Push_the_Commit_to_the_RemoteRepository="git push origin branch-name\n";

         return Stage_Your_Changes +","+
                 Commit_Your_Changes +","+
                 Push_the_Commit_to_the_RemoteRepository ;
    }
}
