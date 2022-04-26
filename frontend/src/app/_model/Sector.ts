import { Level } from "./Level";
import { SubLevel } from "./SubLevel";
import { SubSubLevel } from "./SubSubLevel";

export class Sector {
    id!: number;
    sectorName!: string;
    level!: Level;
    subLevel!: SubLevel;
    subSubLevel!: SubSubLevel;
    isCheckedTerms!: boolean;
}