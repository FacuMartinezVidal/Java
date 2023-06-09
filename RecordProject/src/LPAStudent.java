//For each component in the header, java generates:
//-A field with the same name and declared type as the record component.
//-The field is declared private and final
//-The field is sometimes referred to as component field
//-A toString method that prints out each attribute in a formated String.
//-A public accessor method for each component, has the same name and type of the component, but it dosen't have any
//kind of special prefix, no get, or is, for example.
//-The accessor method, for id in this example, is simply id();
public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
}
