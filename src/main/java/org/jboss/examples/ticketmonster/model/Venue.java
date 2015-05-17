package org.jboss.examples.ticketmonster.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Venue
{
   @Id
   @GeneratedValue
   private Long id;
   @NotNull
   @Size(min = 5, max = 20)
   private String name;
   @Size(min = 10, max = 1000)
   private String description;

   public Long getId()
   {
      return id;
   }

   public void setId(Long id)
   {
      this.id = id;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }

   public int getCapacity()
   {
      return capacity;
   }

   public void setCapacity(int capacity)
   {
      this.capacity = capacity;
   }

   private int capacity;
}
