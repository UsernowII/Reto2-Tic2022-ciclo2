package Model;

public class Students {
    private String name;
    private String lastName;
    private String dataOfBirth;
    private String institutionalEmail;
    private String personalEmail;
    private long phoneNumberCell;
    private long phoneNumber;
    private String academicProgram;

    public Students(String name, String lastName, String dataOfBirth,
                    String institutionalEmail, String personalEmail,
                    long phoneNumberCell, long phoneNumber, String academicProgram)
                    {
        this.name = name;
        this.lastName = lastName;
        this.dataOfBirth = dataOfBirth;
        this.institutionalEmail = institutionalEmail;
        this.personalEmail = personalEmail;
        this.phoneNumberCell = phoneNumberCell;
        this.phoneNumber = phoneNumber;
        this.academicProgram = academicProgram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getInstitutionalEmail() {
        return institutionalEmail;
    }

    public void setInstitutionalEmail(String institutionalEmail) {
        this.institutionalEmail = institutionalEmail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public long getPhoneNumberCell() {
        return phoneNumberCell;
    }

    public void setPhoneNumberCell(long phoneNumberCell) {
        this.phoneNumberCell = phoneNumberCell;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAcademicProgram() {
        return academicProgram;
    }

    public void setAcademicProgram(String academicProgram) {
        this.academicProgram = academicProgram;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", institutionalEmail='" + institutionalEmail + '\'' +
                ", personalEmail='" + personalEmail + '\'' +
                ", phoneNumberCell=" + phoneNumberCell +
                ", phoneNumber=" + phoneNumber +
                ", academicProgram='" + academicProgram + '\'' +
                '}';
    }
}

