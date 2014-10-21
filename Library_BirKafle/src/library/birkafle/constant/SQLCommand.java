package library.birkafle.constant;

public abstract class SQLCommand 
{
	//list all data in books table
	public static String QUERY_1 = "select lbcallnum, lbtitle from libbook";
	//List the call numbers of books with the title ‘Database Management’
	public static String QUERY_2 = "select lbcallnum from libbook where lbtitle like '%Database Management%'";
	// list all data in Student table
	public static String QUERY_3 = "select stid,stname from Student";
	// list studentid,callnumber and fine from CheckOut
	public static String QUERY_4 = "select stid,lbcallnum,cofine from CheckOut";
	// list student name, and callnum of books who have CheckedOut
	public static String QUERY_5 = "select stname,lbcallnum from CheckOut,Student where "
			+ "CheckOut.stid = Student.stid";
	//List title and due date/ date returned with stid
	public static String QUERY_6 = "select stid,lbtitle,coduedate,coreturned from CheckOut,LibBook"
			+ "where CheckOut.lbcallnum = LibBook.lbcallnum";
	//Lists call number and count of the number of times each book was checked out
	public static String QUERY_7 = "select lbcallnum,count(*) from CheckOut"
			+ "where coduedate is not null group by lbcallnum";
}
