package interfase.expl3;

public class SoftWearStudio {
  public static void main(String[] args) {
    JavaEngineer javaEngineer=new JavaEngineer(12);
    QAEngineer qaEngineer=new QAEngineer(12);

    javaEngineer.programning();
    qaEngineer.testing();
    javaEngineer.needlitrbeer();
    qaEngineer.needlitrbeer();
  }
}
