package uk.ac.westminster.products_api;

/**
 * Week 1 starter class.
 *
 * Already provided:
 *   - a private "name" field
 *   - a no-argument constructor (required by Jackson later in the module)
 *   - a full constructor
 *   - a getter and setter for "name"
 *
 * TODO (Lab Activity 3):
 *   Add a new private String field called "email", following the
 *   JavaBean convention: provide a getter called getEmail().
 */
public class Person {

    public String name;

    private String email;




    //This is a default constructor
    public Person() {
    }


    //This is a setter
    public Person(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }



    //email getter and setter.


    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
