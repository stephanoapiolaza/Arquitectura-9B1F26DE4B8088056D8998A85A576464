package cl.bilix.xps.common.util;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;

public class ConverterMap {
	public static <F,T> T ConvertObject(F from, Class<T> typ){
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(from, typ);
	}
	
	/*
	 * Strict mode
	 * example at http://modelmapper.org/examples/flattening/#example-1
	 */
	public static <F,T> T ConvertCustomObject(F from, Class<T> typ, PropertyMap<F,T> prop){
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.addMappings(prop);
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		return modelMapper.map(from, typ);
	}
	
	public static <F,T> List<T> ConvertListCustomObject(List <F> from, Class<T> typ, PropertyMap<F,T> prop){
		List <T> list = new ArrayList<T>();
		for (F objFrom:from){
			list.add(ConverterMap.ConvertCustomObject(objFrom, typ, prop));
		}
		return list;
	}
	
	public static <F,T> List<T> ConvertListObject(List <F> from, Class<T> typ){
		List <T> list = new ArrayList<T>();
		for (F objFrom:from){
			list.add(ConverterMap.ConvertObject(objFrom, typ));
		}
		return list;
	}
	
	public static <F,T> List<T> ConvertListObject(Iterable <F> from, Class<T> typ){
		List <T> list = new ArrayList<T>();
		for (F objFrom:from){
			list.add(ConverterMap.ConvertObject(objFrom, typ));
		}
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public static <F,T> List<T> ConvertListObject(List <F> from){
		List <T> list = (List<T>) from;
		return list;
	}
}
