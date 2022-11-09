package com.ebruski.java15.record;

public sealed interface Employee permits Doctor, Nurse  {
}
