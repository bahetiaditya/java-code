import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame {

    JLabel head, fName, mName, lName, course, gender, phone, address, email, pass, rePass;
    JTextField fn, mn, ln, ph1, ph2, email1, pass1, rePass1;
    Choice courses;
    Checkbox male, female, other;
    CheckboxGroup cbg;
    JTextArea add;
    JButton submit;

    RegistrationForm() {
        super("Registration Form");

        head = new JLabel("Registration Form", JLabel.CENTER);
        fName = new JLabel("First Name");
        mName = new JLabel("Middle Name");
        lName = new JLabel("Last Name");
        course = new JLabel("Course");
        gender = new JLabel("Gender");
        phone = new JLabel("Phone");
        address = new JLabel("Address");
        email = new JLabel("Email");
        pass = new JLabel("Password");
        rePass = new JLabel("Re-type Password");

        fn = new JTextField(10);
        mn = new JTextField(10);
        ln = new JTextField(10);
        ph1 = new JTextField("+91", 5);
        ph1.setEditable(false);
        ph2 = new JTextField(10);
        email1 = new JTextField(15);
        pass1 = new JTextField(15);
        rePass1 = new JTextField(15);

        submit = new JButton("Submit");
        courses = new Choice();
        courses.add("Course");
        courses.add("Java");
        courses.add("Python");
        courses.add("JavaScript");
        courses.add("C++");

        cbg = new CheckboxGroup();
        male = new Checkbox("Male", cbg, false);
        female = new Checkbox("Female", cbg, false);
        other = new Checkbox("Other", cbg, false);

        add = new JTextArea("", 8, 30);

        // head.setBounds();
        fName.setBounds(10, 40, 150, 20);
        fn.setBounds(200, 40, 200, 20);
        mName.setBounds(10, 80, 150, 20);
        mn.setBounds(200, 80, 200, 20);
        lName.setBounds(10, 120, 150, 20);
        ln.setBounds(200, 120, 200, 20);
        course.setBounds(10, 160, 150, 20);
        courses.setBounds(200, 160, 200, 20);
        gender.setBounds(10, 200, 150, 20);
        male.setBounds(200, 200, 100, 20);
        female.setBounds(200, 225, 100, 20);
        other.setBounds(200, 250, 100, 20);
        phone.setBounds(10, 280, 150, 20);
        ph1.setBounds(200, 280, 50, 20);
        ph2.setBounds(260, 280, 140, 20);
        address.setBounds(10, 320, 150, 20);
        add.setBounds(200, 320, 200, 70);
        email.setBounds(10, 410, 150, 20);
        email1.setBounds(200, 410, 200, 20);
        pass.setBounds(10, 450, 150, 20);
        pass1.setBounds(200, 450, 200, 20);
        rePass.setBounds(10, 490, 150, 20);
        rePass1.setBounds(200, 490, 200, 20);
        submit.setBounds(165, 540, 100, 30);

        add(head);
        add(fName);
        add(fn);
        add(mName);
        add(mn);
        add(lName);
        add(ln);
        add(course);
        add(courses);
        add(gender);
        add(male);
        add(female);
        add(other);
        add(phone);
        add(ph1);
        add(ph2);
        add(address);
        add(add);
        add(email);
        add(email1);
        add(pass);
        add(pass1);
        add(rePass);
        add(rePass1);
        add(submit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(430, 650);
        setVisible(true);
    }

    public static void main(String args[]) {
        new RegistrationForm();
    }
}