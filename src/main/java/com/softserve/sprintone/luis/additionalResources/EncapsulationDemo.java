package com.softserve.sprintone.luis.additionalResources;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class EncapsulationDemo {
    private @Getter @Setter int number;
    private @Getter @Setter String stringValue;
    private @Getter @Setter Object anObject;


}
