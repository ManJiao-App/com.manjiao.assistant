cmake_minimum_required(VERSION 3.10)
project(loghook)

set(DOBBY_GENERATE_SHARED OFF)
set(DOBBY_BUILD_EXAMPLE OFF CACHE BOOL "" FORCE)
set(DOBBY_BUILD_TEST OFF CACHE BOOL "" FORCE)
add_subdirectory(dobby)
set_target_properties(dobby_static PROPERTIES POSITION_INDEPENDENT_CODE ON)

add_library(loghook SHARED loghook.cpp)
target_link_libraries(loghook dobby_static log)
target_compile_options(loghook PRIVATE -O2 -fvisibility=hidden)