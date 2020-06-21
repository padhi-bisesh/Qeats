package com.crio.qeats.models;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "menu")
@NoArgsConstructor
public class MenuEntity {

  public String restaurantId;

  public List<ItemEntity> items; 

}