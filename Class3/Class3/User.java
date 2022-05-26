package Class3;

public class User {

        private String userName;
        private String userPassword;

        public void setUserName(String newName) {
        userName = newName;
        }

        public void setUserPassword(String newPassword) {
        userPassword = newPassword;
        }

        public String getUserName() {
        return userName;
        }
        
        public String getUserPassword() {
        return userPassword;
        }
}
    

// Create a login system for Company A.
        // Login system must receive inputs of username and password.
        // The return result will be:
        //      (a) if success: "You are logging in."
        //      (b) if failed: "Wrong username and password. Please try again."
        //
        // Instruction:
        // Mock a data sets of existing Staff: 5 Staff
        // Inputs: (String) username, (String) password
        // Output: (String) results
        //
        // Example:
        // Data Set: [Staff, Staff, Staff, etc...]
        // Inputs: "izzat", "12345"
        // Output: (assuming success) "You are logging in."
        //
        // Rasyid,  54321
        // Amin,    12345
        // Kamarul, 12345
        // Aiman,   44323
        // Syamsul, 99999