package eight;

public class Ghost {

  private String color;

  public Ghost() {
    double rand = Math.random() * 4;
    this.color = "white";
    if (rand < 1) {
      this.color = "yellow";
    } else if (rand < 2) {
      this.color = "purple";
    } else if (rand < 3) {
      this.color = "red";
    }
  }

  public String getColor() {
    return color;
  }
}
