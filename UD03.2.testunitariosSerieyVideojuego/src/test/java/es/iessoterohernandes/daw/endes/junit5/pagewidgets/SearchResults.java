package es.iessoterohernandes.daw.endes.junit5.pagewidgets;


import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchResults {

  // Elements
  public ElementsCollection found = $$("#ires .g");

  // Actions
  public SelenideElement getResult(int index) {
    return found.get(index);
  }

}
