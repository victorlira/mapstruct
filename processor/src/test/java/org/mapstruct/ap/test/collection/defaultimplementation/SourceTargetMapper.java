/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.collection.defaultimplementation;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SourceTargetMapper {

    SourceTargetMapper INSTANCE = Mappers.getMapper( SourceTargetMapper.class );

    @Mapping(target = "fooListNoSetter", source = "fooList")
    Target sourceToTarget(Source source);

    TargetFoo sourceFooToTargetFoo(SourceFoo sourceFoo);

    List<TargetFoo> sourceFoosToTargetFoos(List<SourceFoo> foos);

    Set<TargetFoo> sourceFoosToTargetFoos(Set<SourceFoo> foos);

    Collection<TargetFoo> sourceFoosToTargetFoos(Collection<SourceFoo> foos);

    Iterable<TargetFoo> sourceFoosToTargetFoos(Iterable<SourceFoo> foos);

    void sourceFoosToTargetFoosUsingTargetParameter(@MappingTarget List<TargetFoo> targetFoos,
                                                    Iterable<SourceFoo> sourceFoos);

    Iterable<TargetFoo> sourceFoosToTargetFoosUsingTargetParameterAndReturn(Iterable<SourceFoo> sourceFoos,
                                                                            @MappingTarget List<TargetFoo> targetFoos);

    SortedSet<TargetFoo> sourceFoosToTargetFooSortedSet(Collection<SourceFoo> foos);

    NavigableSet<TargetFoo> sourceFoosToTargetFooNavigableSet(Collection<SourceFoo> foos);

    Map<String, TargetFoo> sourceFooMapToTargetFooMap(Map<Long, SourceFoo> foos);

    SortedMap<String, TargetFoo> sourceFooMapToTargetFooSortedMap(Map<Long, SourceFoo> foos);

    NavigableMap<String, TargetFoo> sourceFooMapToTargetFooNavigableMap(Map<Long, SourceFoo> foos);

    ConcurrentMap<String, TargetFoo> sourceFooMapToTargetFooConcurrentMap(Map<Long, SourceFoo> foos);

    ConcurrentNavigableMap<String, TargetFoo> sourceFooMapToTargetFooConcurrentNavigableMap(Map<Long, SourceFoo> foos);
}
