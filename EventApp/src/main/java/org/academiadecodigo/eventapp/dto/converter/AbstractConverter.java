package org.academiadecodigo.eventapp.dto.converter;

import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractConverter<S, T> implements Converter<S, T> {

    public List<T> convert(List<S> listToConvert) {

        List<T> convertedList = new ArrayList<>(listToConvert.size());

        for (S toConvert: listToConvert) {
            convertedList.add(convert(toConvert));
        }

        return convertedList;
    }
}
