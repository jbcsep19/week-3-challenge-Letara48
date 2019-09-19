public class Resume {
    private String name;
    private String address;
    private String company;
    private String title;
    private int sdate;
    private int edate;
    private String description;

    public Resume() {
    }

    public Resume(String name, String address, String company, String title, int sdate, int edate, String description) {
        this.name = name;
        this.address = address;
        this.company = company;
        this.title = title;
        this.sdate = sdate;
        this.edate = edate;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSdate() {
        return sdate;
    }

    public void setSdate(int sdate) {
        this.sdate = sdate;
    }

    public int getEdate() {
        return edate;
    }

    public void setEdate(int edate) {
        this.edate = edate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getJobs(){
        String job = "";
        job = "Company: " + getCompany() + "\nJob Title: " + getTitle() + "\nStart Date: " + "\nEnd Date: " + "\nJob Description: " + getDescription();
        return job;
    }
}
