package ws.sova.hospital;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hospital hospital = new Hospital("gp1.akmol.co");

        String  json = hospital.getJson("/");
        Departments dep = hospital.depDeserialize(json);
        System.out.print( dep.toString());

        json = hospital.getJson("/contacts");
        Contacts con = hospital.contactDeserialize(json);
        System.out.println(con.toString());

        json = hospital.getJson("/day");
        Day day = hospital.dayDeserialize(json);
        System.out.println(day.toString());

        json = hospital.getJson("/doctors/day-1/uid-1");
        Doctors  docs = hospital.docsDeserialize(json);
        System.out.println(docs.toString());


    }
}
