public class HRDepartment extends Department{
    protected String departmentName(){
        return "HR Department";
    }

    protected String getTodaysWork(){
        return "Fill today’s worksheet and mark your attendance";
    }

    protected String getWorkDeadline(){
        return "Complete by EOD";
    }

    protected String doActivity(){
        return "team Lunch";
    }
}
