public class SwingOberverExample {
  
  JFrame frame;

  public static void main(String[] args) {
    SwingObserverExample example = new SwingObserverExample();
    example.go();
  }

  public void go() {
    frame = new JFrame();

    JButton button = new JButton("Should I do it?");
    button.addActionListener(event -> {
      System.out.println("Don't do it, you might regret it!");
    });
    button.addActionListener(event -> {
      System.out.println("Come on, do it!");
    });
   /* button.addActionListerner(new AngelListener());
    button.addActionListerner(new DevilListener());*/
    
  }

  /*class AngelListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      System.out.println("Don't do it, you might regret it!");
    }
  }

  class DevilListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      System.out.println("Come on, do it!");
    }
  }*/
}
